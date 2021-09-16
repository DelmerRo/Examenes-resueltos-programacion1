package ort.edu.ar.parciallicenciadeconducir;

public class Moto extends Vehiculo{
	private boolean espejosCompletos;
	public Moto(String patente, String marca, int cilindrada, boolean completo) {
		super(patente, marca, cilindrada);
		this.espejosCompletos=completo;
	}
	@Override
	public String toString() {
		return "Moto [espejosCompletos=" + espejosCompletos + "]";
	}
	

}

