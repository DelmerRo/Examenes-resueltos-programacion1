package ort.edu.ar.eje8;

import java.util.ArrayList;

public class EstacionPeaje {
private ArrayList<Cabina>cabinas;
private String idPeaje;
private String descripcion;

public EstacionPeaje( String idPeaje, String descripcion) {
	super();
	this.cabinas = new ArrayList<>();
	this.idPeaje = idPeaje;
	this.descripcion = descripcion;
}



@Override
public String toString() {
	return "EstacionPeaje [cabinas=" + cabinas + ", idPeaje=" + idPeaje + ", descripcion=" + descripcion + "]";
}

public static final int dameHoraActual() {
	return 19;
	
}


}
