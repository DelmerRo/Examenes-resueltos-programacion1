package ort.edu.ar.eje9;

public abstract class Barco {
	private String matricula;
	private double esLora;
	private int añoFabricacion;
	private String nomDueño;

	public Barco(String matricula, double esLora, int añoFabricacion, String nomDueño) {
		super();
		this.matricula = matricula;
		this.esLora = esLora;
		this.añoFabricacion = añoFabricacion;
		this.nomDueño = nomDueño;
	}

	public abstract double valorAdicional();

	private double precioBase() {
		return Puerto.getPrecioBase() * this.esLora;
	}

	public double PrecioTotal() {
		return this.precioBase()+valorAdicional();	
	}
	@Override
	public String toString() {
		return "Barco [matricula=" + matricula + ", esLora=" + esLora + ", añoFabricacion=" + añoFabricacion
				+ ", nomDueño=" + nomDueño + "]";
	}
}
