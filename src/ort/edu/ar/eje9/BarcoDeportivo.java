package ort.edu.ar.eje9;

public class BarcoDeportivo extends Barco {
	public final double INDICE_CALCULO_DE_POTENCIA=0.35;
	private double potenciaEnHP;
	private int factorAerodinamico;
public BarcoDeportivo(String matricula, double esLora, int añoFabricacion, String nomDueño,double potenciaEnHP,int fe) {
		super(matricula, esLora, añoFabricacion, nomDueño);
		this.potenciaEnHP=potenciaEnHP;
		this.factorAerodinamico=fe;
	}
@Override
public String toString() {
	return super.toString()+"BarcoDeportivo [potenciaEnHP=" + potenciaEnHP + ", factorAerodinamico=" + factorAerodinamico + "]";
}
protected double getPotenciaEnHP() {
	return potenciaEnHP;
}
protected int getFactorAerodinamico() {
	return factorAerodinamico;
}

protected double calcularConsumo() {
	return this.potenciaEnHP/this.factorAerodinamico*INDICE_CALCULO_DE_POTENCIA;	
}
@Override
public double valorAdicional() {
	return Puerto.getPrecioAdicional()*(this.potenciaEnHP*0.50);
}

}
