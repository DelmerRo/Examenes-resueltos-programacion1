package ort.edu.ar.eje9;

public class BarcoDeportivoDeLujo extends BarcoDeportivo {
public BarcoDeportivoDeLujo(String matricula, double esLora, int a�oFabricacion, String nomDue�o,
			double potenciaEnHP, int fe) {
		super(matricula, esLora, a�oFabricacion, nomDue�o,  potenciaEnHP, fe);
	}
@Override
protected double calcularConsumo() {
	return 2*super.getPotenciaEnHP()*super.INDICE_CALCULO_DE_POTENCIA;	
}

}
