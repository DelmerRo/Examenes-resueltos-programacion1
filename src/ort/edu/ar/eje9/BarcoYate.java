package ort.edu.ar.eje9;

public class BarcoYate extends Barco {
	private int cantCamarotes;
public BarcoYate(String matricula, double esLora, int añoFabricacion, String nomDueño,int cantCamarotes) {
		super(matricula, esLora, añoFabricacion, nomDueño);
		this.cantCamarotes=cantCamarotes;
	}
@Override
public String toString() {
	return "BarcoYate [cantCamarotes=" + cantCamarotes + "]";
}

@Override
public double valorAdicional() {
	// TODO Auto-generated method stub
	return Puerto.getPrecioAdicional()*this.cantCamarotes;
}



}
