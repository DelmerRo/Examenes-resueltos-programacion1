package ort.edu.ar.eje7;

import java.util.ArrayList;

public class Aplicacion {
private ArrayList<Personal>listaDePersonal;

@Override
public String toString() {
	return "Aplicacion [listaDePersonal=" + listaDePersonal + "]";
}

public Aplicacion() {
	super();
	this.listaDePersonal = new ArrayList<>();
}

public void agregarPersonal(Personal per) {
	this.listaDePersonal.add(per);
	
}

public void getSalario() {
	for(Personal p:this.listaDePersonal) {
		System.out.println(p.nombreCompleto()+" su sueldo es: "+p.getSalario());
	}
	    
}

public void personalConMasClientes() {
	double maxCliente=Double.MIN_VALUE;
	Personal perMax=null;
	for(Personal p:this.listaDePersonal) {
		if(p instanceof PersonalAComision && ((PersonalAComision) p).cantCliente()>maxCliente) {
			maxCliente=((PersonalAComision) p).cantCliente();	
			perMax=p;
		}
	}
	System.out.println("\n"+perMax);
	
}



}
