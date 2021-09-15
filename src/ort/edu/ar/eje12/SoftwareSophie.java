package ort.edu.ar.eje12;

import java.util.ArrayList;

public class SoftwareSophie {
	private ArrayList<Programa> programas;

	public SoftwareSophie() {
		super();
		this.programas = new ArrayList<>();
	}

	public void ingresarPrograma(Programa p) {
		this.programas.add(p);

	}

	public double programasPorDebajoDe(double umbral) {
		ArrayList<Programa> programasDebajoDelProm = new ArrayList<>();
		for (Programa programa : this.programas) {
			if (programa.indiceDeCalidad() < umbral) {
				programasDebajoDelProm.add(programa);
			}
		}
		return 0;

	}

	@Override
	public String toString() {
		return "SoftwareSophie [programas=" + programas + "]";
	}
}
