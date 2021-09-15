package ort.edu.ar.eje9;

public abstract class Barco {
	private String matricula;
	private double esLora;
	private int a�oFabricacion;
	private String nomDue�o;

	public Barco(String matricula, double esLora, int a�oFabricacion, String nomDue�o) {
		super();
		this.matricula = matricula;
		this.esLora = esLora;
		this.a�oFabricacion = a�oFabricacion;
		this.nomDue�o = nomDue�o;
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
		return "Barco [matricula=" + matricula + ", esLora=" + esLora + ", a�oFabricacion=" + a�oFabricacion
				+ ", nomDue�o=" + nomDue�o + "]";
	}
}
