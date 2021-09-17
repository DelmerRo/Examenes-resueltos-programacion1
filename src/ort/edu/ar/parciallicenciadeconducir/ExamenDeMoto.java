package ort.edu.ar.parciallicenciadeconducir;

import java.util.ArrayList;

public class ExamenDeMoto extends Examen {
	private static final double TOPE_CILINDRADA = 150;
	private static final int TOPE_MAX = 120;
	private ArrayList<Circuito> circuitos;
	private Persona p;
	private Vehiculo v;

	public ExamenDeMoto(String fecha, Persona p, ArrayList<Circuito> listaCircuitos, Vehiculo v) {
		super(fecha);
		this.p = p;
		this.circuitos = listaCircuitos;
		this.v = v;

	}

	@Override
	public String toString() {
		return "ExamenDeMoto [circuitos=" + circuitos + ", p=" + p + ", v=" + v + "]";
	}

	@Override
	public boolean aprobo() {
		if (v.getCilindrada() > TOPE_CILINDRADA && this.aproboCircuito()) {

		}
		return false;
	}

	private boolean aproboCircuito() {
		boolean aprobo = false;
		if (this.v.getCilindrada() > TOPE_CILINDRADA) {
			aprobo = this.cantCircuitosDesaprobados() == this.circuitos.size();
		} else
			aprobo = this.cantCircuitosDesaprobados() <= 1 && this.tiempoTotal() < TOPE_MAX;
		return aprobo;
	}

	private int tiempoTotal() {
		int tiempoTotal = 0;
		for (Circuito circuito : circuitos) {
			tiempoTotal += circuito.getTiempoEnSegundos();
		}
		return tiempoTotal;
	}

	private int cantCircuitosDesaprobados() {
		int cant = 0;
		for (Circuito circuito : circuitos) {
			if (!circuito.aprobo()) {
				cant++;
			}

		}
		return cant;
	}

}
