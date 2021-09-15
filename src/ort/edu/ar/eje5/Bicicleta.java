package ort.edu.ar.eje5;

public class Bicicleta {
private String marca;
private String modelo;
private double cantKilometros;
public Bicicleta(String marca, String modelo, double cantKilometros) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.cantKilometros = cantKilometros;
}
@Override
public String toString() {
	return "Bicicleta [marca=" + marca + ", modelo=" + modelo + ", cantKilometros=" + cantKilometros + "]";
}

public double getCantKilometros() {
	return cantKilometros;
}

}
