package ort.edu.ar.eje5;

import java.util.ArrayList;

public class Taller {
private static final int MAX_KIL=2000;
private static final int POTENCIA=250;
private ArrayList<Bicicleta>bicicletas;
public Taller(ArrayList<Bicicleta> bicicletas) {
	super();
	this.bicicletas = bicicletas;
}
@Override
public String toString() {
	return "Taller[bicicletas=" + bicicletas + "]";
}
public int cantServiciosPosibles(ArrayList<Bicicleta> lista) {
	int serviviosPosibles=0;
	for(Bicicleta b:lista) {
		if(( b.getCantKilometros()<MAX_KIL)){	
			serviviosPosibles++;
		}else if((b instanceof  BicicletaElectrica) &&((BicicletaElectrica)b).getPotencia()<POTENCIA) {
			serviviosPosibles++;
		}
	}
	return serviviosPosibles;
	// TODO Auto-generated method stub
	
}


}
