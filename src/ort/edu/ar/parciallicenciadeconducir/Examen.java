package ort.edu.ar.parciallicenciadeconducir;


public abstract class Examen implements Evaluable {
private String Fecha;
private Persona persona;
public Examen(String fecha) {
	super();
	Fecha = fecha;
}
public String getFecha() {
	return Fecha;
}
public Persona getPersona() {
	return persona;
}
@Override
public String toString() {
	return "Examen [Fecha=" + Fecha + ", persona=" + persona + "]";
}

}

