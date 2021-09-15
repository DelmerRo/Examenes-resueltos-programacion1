package ort.edu.ar.eje8;

public class Cabina {
	/*private static final int NO_H_PICO_BASE=6;
	private static final int NO_H_PICO_TOPE=10;
	private static final int SI_H_PICO_BASE=17;
	private static final int SI_H_PICO_TOPE=20;
	private static final double INCREMENTO_H_PICO=0.08;*/
	private String idCabina;
	private MedioDePago medioDePago;
	private Vehiculo vehiculo;
	public Cabina(String idCabina, MedioDePago medioDePago, Vehiculo vehiculo) {
		super();
		this.idCabina = idCabina;
		this.medioDePago = medioDePago;
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Cabina [idCabina=" + idCabina + ", medioDePago=" + medioDePago + ", vehiculo=" + vehiculo + "]";
	}
	public double cobrar(Vehiculo veh) {
		double cobro=0;
	//cobro=veh.getTipo().getTarifa()+calc
		return cobro;
		
	}
}
