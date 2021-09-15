package ort.edu.ar.eje11;

public class PersonaConObraSocial extends Persona {
	private String nombreDePrestador;
	private int nroDeAfiliado;
public PersonaConObraSocial(String dni, String nombre, String apellido, int edad,Motivo motivo,String nombreDePrestador,int nroDeAfiliado) {
		super(dni, nombre, apellido, edad,motivo);
		this.nombreDePrestador=nombreDePrestador;
		this.nroDeAfiliado=nroDeAfiliado;
	}
@Override
public String toString() {
	return "PersonaConObraSocial [nombreDePrestador=" + nombreDePrestador + ", nroDeAfiliado=" + nroDeAfiliado + "]";
}

@Override
public int tienesPrioridad() {
	int prioridad=2;
	if(super.getEdad()>=60 || this.getMotivo().equals(Motivo.CONTACTO_ESTRECHO)) {
		prioridad=1;
	}
	return prioridad;
}
@Override
public void mensaje(String mensaje) {
	System.out.println(mensaje);
	
}

}
