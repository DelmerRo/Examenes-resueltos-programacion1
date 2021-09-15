package ort.edu.ar.eje6;

import java.util.ArrayList;

public class Figura {
private ArrayList<GrupoDeFiguras>gruposDeFiguras;
public Figura() {
	super();
	this.gruposDeFiguras=new ArrayList<>();
}

public void mostrarTodo() {
	for(GrupoDeFiguras gp:this.gruposDeFiguras) {
		System.out.println("Area:"+gp.calcularArea());
		System.out.println("Perimetro: "+gp.calcularPerimetro());
	}
	
}

public void agregarFigura(GrupoDeFiguras gp) {
	this.gruposDeFiguras.add(gp);
	
}

}
