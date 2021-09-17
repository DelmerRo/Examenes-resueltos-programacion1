package ort.edu.ar.parciallicenciadeconducir;

import java.util.ArrayList;

public class Sede {
	private ArrayList<Examen> examenes;

	public Sede() {
		super();
		this.examenes = new ArrayList<>();
	}

	public void agregarExamen(Examen e) {
		this.examenes.add(e);

	}

	public void mostrarExamenes() {
		for (Examen e : this.examenes) {
			System.out.println(e);
		}

	}

	public Informe obtenerInforme() {
		double porcentajeDeExamenesReprobados = this.obtenerPorcentajeDeExamenesReprobados();
		double promedioDeExamenesAutosAprobados = this.obtenerPromedioDeExamenesAutosAprobados();
		return new Informe(porcentajeDeExamenesReprobados, promedioDeExamenesAutosAprobados);
		// TODO Auto-generated method stub

	}

	private double obtenerPromedioDeExamenesAutosAprobados() {
		int examenesAprobados = 0;
		int cantExamenes = 0;
		for (Examen examen : examenes) {
			if (examen instanceof ExamenDeAuto) {
				cantExamenes++;
				if (((ExamenDeAuto) examen).aprobo()) {
					examenesAprobados++;
				}
			}

		}
		return examenesAprobados > 0 ? (double) cantExamenes / (double) examenesAprobados : 0;
	}

	private double obtenerPorcentajeDeExamenesReprobados() {
		int cont = 0;
		int cantExamenes = this.examenes.size();
		for (Examen examen : this.examenes) {
			if (!examen.aprobo()) {
				cont++;
			}

		}
		return cont > 0 ? (double) cont / cantExamenes * 100 : 0;
	}

}
