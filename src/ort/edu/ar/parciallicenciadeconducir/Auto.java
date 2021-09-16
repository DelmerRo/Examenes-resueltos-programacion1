package ort.edu.ar.parciallicenciadeconducir;

public class Auto extends Vehiculo{
	private int cantPuertas;

	public Auto(String patente, String marca, double cilindrada, int cantPuertas) {
		super(patente, marca, cilindrada);
		this.cantPuertas=cantPuertas;
	}

	@Override
	public String toString() {
		return "Auto [cantPuertas=" + cantPuertas + "]";
	}

	
		


}
