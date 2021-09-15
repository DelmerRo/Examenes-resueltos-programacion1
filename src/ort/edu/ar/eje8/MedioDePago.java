package ort.edu.ar.eje8;

public abstract class MedioDePago  {
private String descripcion;
public MedioDePago(String descripcion) {
	super();
	this.descripcion = descripcion;
}

public abstract double calcularDescuento();
@Override
public String toString() {
	return "MedioDePago [descripcion=" + descripcion + "]";
}




}
