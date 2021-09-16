package ort.edu.ar.parciallicenciadeconducir;

public class Persona {
private String dni;
private String nombre;
private String apellido;
public Persona(String dni, String nombre, String apellido) {
	super();
	this.dni = dni;
	this.nombre = nombre;
	this.apellido = apellido;
}
public String getDni() {
	return dni;
}
public String getNombre() {
	return nombre;
}
public String getApellido() {
	return apellido;
}
@Override
public String toString() {
	return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
}

}
