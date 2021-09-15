package ort.edu.ar.eje6;

public class TrianguloEquilatero extends GrupoDeFiguras {
private double lado;
	public TrianguloEquilatero(String color,double lado) {
		super(color);
		this.lado=lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.lado*this.lado;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 60;
	}
}
