package ort.edu.ar.eje8;

public class Pase extends MedioDePagoElectronico {
	private static final double DCTO=0.15;
	private static final double DCTO_MIN=0.12;
	public Pase(String descripcion, int cantDiasCobro) {
		super(descripcion, cantDiasCobro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularDescuento() {
		return this.cantDiasDemoraCobro<5?DCTO:DCTO_MIN;
	}
}
