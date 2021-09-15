package ort.edu.ar.eje9;

public class Amarra {
private int nroAmarra;
private String ubicacion;
private Barco barco;
public Amarra(int nroAmarra, String ubicacion, Barco barco) {
	super();
	this.nroAmarra = nroAmarra;
	this.ubicacion = ubicacion;
	this.barco = barco;
}

@Override
public String toString() {
	return "Amarra [nroAmarra=" + nroAmarra + ", ubicacion=" + ubicacion + ", barco=" + barco + "]";
}
public double dameImporteDeBarco() {
	return this.barco.PrecioTotal();
}
public Barco obtenerBarco() {
	return this.barco ;
}

}
