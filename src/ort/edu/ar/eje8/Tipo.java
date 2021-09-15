package ort.edu.ar.eje8;

public class Tipo {
private String nombre;
private double tarifa;
public Tipo(String nombre, double tarifa) {
	super();
	this.nombre = nombre;
	this.tarifa = tarifa;
}

public double getTarifa() {
	return tarifa;
}
@Override
public String toString() {
	return "Tipo [nombre=" + nombre + ", tarifa=" + tarifa + "]";
}
}
