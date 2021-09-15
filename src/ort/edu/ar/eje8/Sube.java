package ort.edu.ar.eje8;

public class Sube extends MedioDePagoElectronico{

	public Sube(String descripcion, int cantDiasCobro) {
		super(descripcion, cantDiasCobro);
	}

	private static final double DCTO=0.1;

	@Override
	public double calcularDescuento() {
		return DCTO;
	}
}
