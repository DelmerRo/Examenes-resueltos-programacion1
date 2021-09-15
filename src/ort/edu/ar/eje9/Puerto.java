package ort.edu.ar.eje9;

import java.util.ArrayList;

public class Puerto {
	private static double precioBase;
	private static double precioAdicional;
	private ArrayList<Amarra> amarras;

	public Puerto(double precioBase, double precioAdicional) {
		super();
		Puerto.precioBase = precioBase;
		Puerto.precioAdicional = precioAdicional;
		this.amarras = new ArrayList<>();
	}

	public static double getPrecioAdicional() {
		return precioAdicional;
	}

	public static double getPrecioBase() {
		return precioBase;
	}

	@Override
	public String toString() {
		return "Puerto [precioBase=" + precioBase + ", amarras=" + amarras + "]";
	}

	public void agregarAmarra(Amarra amarra) {
		this.amarras.add(amarra);
	}

	public void asignarPrecioBase(int preBase) {
		Puerto.precioBase = preBase;
	}

	public void asignarPrecioAdicional(int preAdicional) {
		Puerto.precioAdicional = preAdicional;
	}

	public int barcosConAlquilerMayorA(int importe) {
		int cant = 0;
		for (Amarra a : this.amarras) {
			if (a.dameImporteDeBarco() > importe) {
				System.out.println(a.dameImporteDeBarco());
				cant++;
			}
		}
		return cant;
	}

	public Barco barcoConMayorConsumo() {
		Barco barEnc = null;
		Barco barDepMax = null;
		double consumoMax = Double.MIN_VALUE;
		for (Amarra a : this.amarras) {
			barEnc=a.obtenerBarco();
			if ((barEnc instanceof BarcoDeportivo || barEnc instanceof BarcoDeportivoDeLujo)
					&& ((BarcoDeportivo) barEnc).calcularConsumo() > consumoMax) {
				consumoMax=((BarcoDeportivo) barEnc).calcularConsumo();
				barDepMax= barEnc;
			}
		}
		return barDepMax;
	}
}
