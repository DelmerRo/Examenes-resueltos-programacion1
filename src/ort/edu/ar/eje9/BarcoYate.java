package ort.edu.ar.eje9;

public class BarcoYate extends Barco {
	private int cantCamarotes;
public BarcoYate(String matricula, double esLora, int a�oFabricacion, String nomDue�o,int cantCamarotes) {
		super(matricula, esLora, a�oFabricacion, nomDue�o);
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
