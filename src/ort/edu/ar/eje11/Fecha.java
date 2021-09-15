package ort.edu.ar.eje11;

import java.util.ArrayList;

public class Fecha {

	private int dia;
	private int mes;
	private int año;
	private ArrayList<Priorizable> priorizables;
//	private ArrayList<Priorizable> notificable;
	private ArrayList<Persona> personas;

	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		this.priorizables = new ArrayList<>();
		///this.notificable = new ArrayList<>();
		this.personas = new ArrayList<>();
	}

	public boolean esDiaHabil() {
		boolean esHabil = false;
		esHabil = true;
		return esHabil;

	}


	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
	}

	public void agregarPersona() {
		// TODO Auto-generated method stub

	}

	public void agregarPersona(Persona p1) {
		this.personas.add(p1);

	}

	public ArrayList<Persona> listaDeNoPrioridad() {
	ArrayList<Persona>listaANotificar=new ArrayList<>();	
		for(Priorizable p:this.priorizables) {
			if(p.tienesPrioridad()==2) {
				listaANotificar.add((Persona) p);
			}		
		}
		return (ArrayList<Persona>) listaANotificar;
	}

public void noticar(String string, ArrayList<Persona> listaNoPriori) {
	for(Persona p:listaNoPriori) {
		p.mensaje(string);;
	}
	
}

public int cantListaTotal() {
	return this.personas.size();
}
}
