package ort.edu.ar.eje11;

public class Test {

	public static void main(String[] args) {
	Centro centro=new Centro();
	Fecha f1=new Fecha(01, 02, 2021);
	Fecha f2=new Fecha(01, 02, 2021);
	Fecha f3=new Fecha(01, 02, 2021);
	Fecha f4=new Fecha(01, 02, 2021);	
	centro.agregarFecha(f1);
	centro.agregarFecha(f2);
	centro.agregarFecha(f3);
	centro.agregarFecha(f4);
	//String dni, String nombre, String apellido, int edad,Motivo motivo,String nombreDePrestador,int nroDeAfiliado
	Persona p1=new Persona("1111", "Delmer", "Cardona", 18,Motivo.CONTACTO_ESTRECHO);
	Persona p2=new Persona("2222", "Leo", "Reynoso", 98,Motivo.CONTACTO_ESTRECHO );
	Persona p3=new Persona("3333", "Julian", "Martinez", 27, Motivo.REPETICION_POR_ERROR);
	Persona p4=new Persona("4444", "Richard", "Paez", 78, Motivo.VIAJE);
	Persona p5=new Persona("5555", "Moises", "Vagi", 60,Motivo.VIAJE );
	Persona p6=new Persona("6666", "Sergio", "Martinez", 27, Motivo.REPETICION_POR_ERROR);
	Persona p7=new Persona("7777", "Lucas", "Poliu", 78, Motivo.VIAJE);
	Persona p8=new Persona("8888", "Nesi", "Vege", 60,Motivo.VIAJE );
	
	Persona p9=new PersonaConObraSocial("9999", "Juan", "Cardona", 18,Motivo.CONTACTO_ESTRECHO,"Osecac",123);
	Persona p10=new PersonaConObraSocial("1010", "Lucas", "Merino", 108,Motivo.CONTACTO_ESTRECHO, "Sancor", 1234);
	Persona p11=new PersonaConObraSocial("2020", "Mena", "Maltes", 12,Motivo.REPETICION_POR_ERROR, "Trinidad",1235);
	Persona p12=new PersonaConObraSocial("3030", "Melissa", "Nert", 26,Motivo.VIAJE,"Medife", 1236);
	Persona p13=new PersonaConObraSocial("4040", "maria", "Merui", 87,Motivo.CONTACTO_ESTRECHO, "Galeno", 1237);
	Persona p14=new PersonaConObraSocial("5050", "Maeru", "Medina", 12,Motivo.REPETICION_POR_ERROR, "Osecac",1235);
	Persona p15=new PersonaConObraSocial("6060", "Moni", "Nesi", 26,Motivo.VIAJE,"Medife", 1236);
	Persona p16=new PersonaConObraSocial("7070", "Lavezzi", "Serto", 87,Motivo.CONTACTO_ESTRECHO, "Galeno", 1237);
	
	f1.agregarPersona(p1);
	f1.agregarPersona(p2);
	f2.agregarPersona(p3);
	f2.agregarPersona(p4);
	f3.agregarPersona(p5);
	f2.agregarPersona(p6);
	f2.agregarPersona(p7);
	f3.agregarPersona(p8);
	
	f1.agregarPersona(p9);
	f2.agregarPersona(p10);
	f2.agregarPersona(p11);
	f1.agregarPersona(p12);
	f3.agregarPersona(p13);
	f2.agregarPersona(p14);
	f1.agregarPersona(p15);
	f3.agregarPersona(p16);
	
	centro.revisar();
	}

}
