package ort.edu.ar.eje7;

public abstract  class   Personal {
private String DNI;
private String nombre;
public  String apellido;
protected int añoDeIngreso;
public Personal(String dNI, String nombre, String apellido, int añoDeIngreso) {
	super();
	DNI = dNI;
	this.nombre = nombre;
	this.apellido = apellido;
	this.añoDeIngreso = añoDeIngreso;
}

public abstract double getSalario();

public String nombreCompleto() {
	return this.nombre+" "+this.apellido;
}

public int getAñoDeIngreso() {
	return añoDeIngreso;
}
@Override
public String toString() {
	return "Personal [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", añoDeIngreso=" + añoDeIngreso
			+ "]";
}

}
