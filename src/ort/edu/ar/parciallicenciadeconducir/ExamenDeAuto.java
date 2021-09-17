package ort.edu.ar.parciallicenciadeconducir;

public class ExamenDeAuto extends Examen {
	private static final int MIN_APROBAR_CIRCUITO = 80;
	private Circuito circuito;
	private Vehiculo v;

	public ExamenDeAuto(String fecha, Circuito c, Vehiculo v) {
		super(fecha);
		this.circuito = c;
		this.v = v;
	}

	@Override
	public String toString() {
		return "ExamenDeAuto [circuito=" + circuito + ", v=" + v + "]";
	}

	@Override
	public boolean aprobo() {

		return circuito.aprobo() && circuito.getTiempoEnSegundos() < MIN_APROBAR_CIRCUITO;
	}

}
