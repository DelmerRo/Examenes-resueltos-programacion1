package ort.edu.ar.eje10;

import java.util.ArrayList;

public class Historial {
private ArrayList<Facturable>facturables;

public Historial() {
	super();
	this.facturables = new ArrayList<>();
}

public void agregarInsumos(Insumo insumo) {
	this.facturables.add(insumo);
	
}

public void agregarServicioDeArmado(Servicio servicio) {
	this.facturables.add(servicio);
	
}

public void montoTotalFacturado() {
for(Facturable f:this.facturables) {
	System.out.print("\n"+f.mostrarActividad()+f.montoDeFacturacion());
}
}

public int cantServiciosSimples() {
	int cant = 0;
	for(Facturable f:this.facturables) {
		if(f instanceof ServicioDeReparacion && ((ServicioDeReparacion) f).getDificultad()<2) {
			cant++;
		}
	}
	return cant;
}

}
