package ort.edu.ar.eje11;

public class Persona implements Priorizable,Notificable{
private String dni;
private String nombre;
private String apellido;
private int edad;
private Motivo motivo;
public Persona(String dni, String nombre, String apellido, int edad,Motivo motivo) {
	super();
	this.dni = dni;
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.motivo=motivo;
}
public Motivo getMotivo() {
	return motivo;
}
public String getDni() {
	return dni;
}

public int getEdad() {
	return edad;
}

@Override
public String toString() {
	return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", motivo="
			+ motivo + "]";
}
@Override
public int tienesPrioridad() {
	int prioridad=2;
	if(this.edad>=60 || this.motivo.equals(Motivo.CONTACTO_ESTRECHO)) {
		prioridad=1;
	}
	return prioridad;
}
@Override
public void mensaje(String mensaje) {
	System.out.println(mensaje);
	
}
}
