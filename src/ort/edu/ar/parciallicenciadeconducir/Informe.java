package ort.edu.ar.parciallicenciadeconducir;

public class Informe {
private double porcentajeDeExamenesReprobados;
private double promedioDeExamenesAutosAprobados;
	public Informe(double porcentajeDeExamenesReprobados, double promedioDeExamenesAutosAprobados) {
		this.porcentajeDeExamenesReprobados=porcentajeDeExamenesReprobados;
	this.promedioDeExamenesAutosAprobados=promedioDeExamenesAutosAprobados;
	}
	@Override
	public String toString() {
		return "Informe [porcentajeDeExamenesReprobados=" + porcentajeDeExamenesReprobados
				+ ", promedioDeExamenesAutosAprobados=" + promedioDeExamenesAutosAprobados + "]";
	}

}
