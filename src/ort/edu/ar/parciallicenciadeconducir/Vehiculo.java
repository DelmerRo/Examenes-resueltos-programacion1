package ort.edu.ar.parciallicenciadeconducir;

public abstract class Vehiculo {
private String patente;
private String marca;
private double cilindrada;
public Vehiculo(String patente, String marca, double cilindrada) {
	super();
	this.patente = patente;
	this.marca = marca;
	this.cilindrada = cilindrada;
}
public String getPatente() {
	return patente;
}
public String getMarca() {
	return marca;
}
public double getCilindrada() {
	return cilindrada;
}
@Override
public String toString() {
	return "Vehiculo [patente=" + patente + ", marca=" + marca + ", cilindrada=" + cilindrada + "]";
}


}
