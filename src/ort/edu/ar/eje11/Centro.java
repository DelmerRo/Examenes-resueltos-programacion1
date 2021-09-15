package ort.edu.ar.eje11;

import java.util.ArrayList;

public class Centro {
private static final int TEST_MAX =10;
private ArrayList<Fecha> fechas;

public Centro() {
	super();
	this.fechas = new ArrayList<>();
}

public void agregarFecha(Fecha fecha) {
	this.fechas.add(fecha);	
}

public void revisar() {
	for(Fecha f:this.fechas) {
		ArrayList<Persona> listaNoPriori=f.listaDeNoPrioridad();
		if((listaNoPriori.size()-f.cantListaTotal())>TEST_MAX) {
			f.noticar("No hay cupos para hoy",listaNoPriori);
		
		}else {
			System.out.println("Hay Cantidad de Test suficiente!!");
		}
	}
}


}
