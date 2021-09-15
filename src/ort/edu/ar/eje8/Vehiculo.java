package ort.edu.ar.eje8;

public class Vehiculo {
private String patente;
private Tipo tipo;
public Vehiculo(String patente, Tipo tipo) {
	super();
	this.patente = patente;
	this.tipo = tipo;
}

public Tipo getTipo() {
	return tipo;
}
@Override
public String toString() {
	return "Vehiculo [patente=" + patente + ", tipo=" + tipo + "]";
}
}
