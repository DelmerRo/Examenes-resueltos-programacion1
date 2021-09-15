package ort.edu.ar.eje12;

import java.util.ArrayList;

public class FuenteDeProgramacion extends Fuente{
private ArrayList<Metodo>lista;
public FuenteDeProgramacion(String nombre, String ubicacion, ArrayList<Metodo> listaMetodos) {
		super(nombre, ubicacion);
		this.lista=listaMetodos;
	}
@Override
public String toString() {
	return "\nFuenteDeProgramacion [lista=" + lista + "]";
}
@Override
public double indiceDeCalidad() {
	// TODO Auto-generated method stub
	return 0;
}
public Metodo dameTuMetodo(String nombreMetodo) {
int i=0;
Metodo metodoEncontrado=null;
while(i<this.lista.size() && metodoEncontrado==null) {
	Metodo metodoAux=this.lista.get(i);
	if(metodoAux.getNombre().equals(nombreMetodo)) {
		metodoEncontrado=metodoAux;
	}else {
		i++;
	}
}

	return null;
}
}
