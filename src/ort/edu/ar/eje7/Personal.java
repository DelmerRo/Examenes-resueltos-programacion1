package ort.edu.ar.eje7;

public abstract  class   Personal {
private String DNI;
private String nombre;
public  String apellido;
protected int a�oDeIngreso;
public Personal(String dNI, String nombre, String apellido, int a�oDeIngreso) {
	super();
	DNI = dNI;
	this.nombre = nombre;
	this.apellido = apellido;
	this.a�oDeIngreso = a�oDeIngreso;
}

public abstract double getSalario();

public String nombreCompleto() {
	return this.nombre+" "+this.apellido;
}

public int getA�oDeIngreso() {
	return a�oDeIngreso;
}
@Override
public String toString() {
	return "Personal [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", a�oDeIngreso=" + a�oDeIngreso
			+ "]";
}

}
