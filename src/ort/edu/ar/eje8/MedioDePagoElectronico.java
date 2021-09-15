package ort.edu.ar.eje8;

public abstract class MedioDePagoElectronico extends MedioDePago{
	protected int cantDiasDemoraCobro;
	public MedioDePagoElectronico(String descripcion,int cantDiasCobro) {
		super(descripcion);
		this.cantDiasDemoraCobro=cantDiasCobro;
	}
	public int getCantDiasDemoraCobro() {
		return cantDiasDemoraCobro;
	}




}
