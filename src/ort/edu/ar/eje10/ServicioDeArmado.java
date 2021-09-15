package ort.edu.ar.eje10;

public class ServicioDeArmado extends Servicio{
	private static final double VALOR_POR_HORA=250;
	private int cantHoras;
	public ServicioDeArmado(int cantHoras) {
		super(cantHoras);
		this.cantHoras=cantHoras;
	}
	@Override
	public double montoDeFacturacion() {
		return Matematica.sumarPorcentaje((super.getCantHoras()*valorPorHora()),IVA) ;
	}
	
	@Override
	public double valorPorHora() {
		return VALOR_POR_HORA;
	}
	@Override
	public String mostrarActividad() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName()+" cantidad de horas="+this.cantHoras+", cantidad de horas="+this.valorPorHora()+", Monto total a Facturar= ";
	}



}
