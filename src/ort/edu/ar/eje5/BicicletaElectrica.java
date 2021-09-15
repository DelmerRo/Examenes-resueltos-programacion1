package ort.edu.ar.eje5;

public class BicicletaElectrica extends Bicicleta {
private  int potencia;
	public BicicletaElectrica(String marca, String modelo, double cantKilometros,int potencia) {
		super(marca, modelo, cantKilometros);
		this.potencia=potencia;
	}
	public int getPotencia() {
		return potencia;
	}


}
