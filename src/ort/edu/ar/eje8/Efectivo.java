package ort.edu.ar.eje8;

public class Efectivo extends MedioDePago {
	private static final int DCTO=0;
	public Efectivo(String descripcion) {
		super(descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularDescuento() {
		return DCTO;
	}

}
