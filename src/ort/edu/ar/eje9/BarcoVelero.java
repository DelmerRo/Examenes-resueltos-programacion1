package ort.edu.ar.eje9;

public class BarcoVelero extends Barco {
	private int cantMastil;
public BarcoVelero(String matricula, double esLora, int a�oFabricacion, String nomDue�o,int cantMastil) {
		super(matricula, esLora, a�oFabricacion, nomDue�o);
		this.cantMastil=cantMastil;
	}

@Override
public String toString() {
	return "BarcoVelero [cantMastil=" + cantMastil + "]";
}
@Override
public double valorAdicional() {
	return Puerto.getPrecioAdicional()*this.cantMastil;
}



}
