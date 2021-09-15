package ort.edu.ar.eje6;

public abstract class GrupoDeFiguras {
	private String color;

	public GrupoDeFiguras(String color) {
		super();
		this.color = color;
	}

	@Override
	public String toString() {
		return "GrupoDeFiguras [color=" + color + "]";
	}
	
	public abstract double calcularArea();
	public abstract double calcularPerimetro();

	public void agregarFigura(Figura figura) {
		
		
	}
}
