package ort.edu.ar.eje9;

public class BarcoVelero extends Barco {
	private int cantMastil;
public BarcoVelero(String matricula, double esLora, int añoFabricacion, String nomDueño,int cantMastil) {
		super(matricula, esLora, añoFabricacion, nomDueño);
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
