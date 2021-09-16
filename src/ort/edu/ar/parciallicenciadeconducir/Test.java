package ort.edu.ar.parciallicenciadeconducir;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Sede sede = new Sede();

		Persona p = new Persona(null, null, null);
		Persona p1 = new Persona(null, null, null);
	

		Vehiculo v = new Moto("01", "Peugot", 200, true);
		Vehiculo v1 = new Moto("01", "Peugot", 200, true);

		Vehiculo v3 = new Auto("01", "Peugot", 200, 3);
		Vehiculo v4 = new Auto("01", "Peugot", 200, 4);

		ArrayList<Circuito> listaCircuitos = new ArrayList<>();
		listaCircuitos.add(new Circuito(120, 3));
		listaCircuitos.add(new Circuito(180, 2));
		listaCircuitos.add(new Circuito(270, 0));
		listaCircuitos.add(new Circuito(360, 3));
		Circuito c4 = new Circuito(60, 1);

		ArrayList<Circuito> listaCircuitos1 = new ArrayList<>();
		listaCircuitos1.add(new Circuito(120, 2));
		listaCircuitos1.add(new Circuito(90, 1));
		listaCircuitos1.add(new Circuito(100, 2));
		listaCircuitos1.add(new Circuito(360, 3));
		Circuito c5 = new Circuito(81, 0);

		Examen em = new ExamenDeMoto("0102", p, listaCircuitos,v);
		Examen em1 = new ExamenDeMoto("0202", p1, listaCircuitos1,v1);

		Examen ea = new ExamenDeAuto("0402", c4,v3);
		Examen ea1 = new ExamenDeAuto("0502", c5,v4);
		Examen ea2 = new ExamenDeAuto("0503", c5,v4);
		Examen ea4 = new ExamenDeAuto("0405", c4,v3);
		
		sede.agregarExamen(em);
		sede.agregarExamen(em1);

		sede.agregarExamen(ea);
		sede.agregarExamen(ea1);
		sede.agregarExamen(ea2);
		sede.agregarExamen(ea4);
		

		sede.mostrarExamenes();
		
		System.out.println(sede.obtenerInforme());
	}

}
