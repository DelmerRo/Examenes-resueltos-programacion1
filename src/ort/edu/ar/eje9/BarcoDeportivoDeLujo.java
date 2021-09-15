package ort.edu.ar.eje9;

public class BarcoDeportivoDeLujo extends BarcoDeportivo {
public BarcoDeportivoDeLujo(String matricula, double esLora, int añoFabricacion, String nomDueño,
			double potenciaEnHP, int fe) {
		super(matricula, esLora, añoFabricacion, nomDueño,  potenciaEnHP, fe);
	}
@Override
protected double calcularConsumo() {
	return 2*super.getPotenciaEnHP()*super.INDICE_CALCULO_DE_POTENCIA;	
}

}
