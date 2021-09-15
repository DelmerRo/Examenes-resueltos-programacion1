package ort.edu.ar.eje6;

public class Circunferencia extends GrupoDeFiguras {
private static final double PI=3.1416; 
private double radio;
	public Circunferencia(String color,double radio) {
		super(color);
	this.radio=radio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return PI*this.radio;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 20;
	}

}
