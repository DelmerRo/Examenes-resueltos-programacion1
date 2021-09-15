package ort.edu.ar.eje10;

public abstract class  Servicio implements Facturable{
private int cantHoras;
public abstract   double valorPorHora();
public Servicio(int cantHoras) {
	super();
	this.cantHoras = cantHoras;
}

public int getCantHoras() {
	return cantHoras;
}

@Override
public String toString() {
	return "Servicio [cantHoras=" + cantHoras + "]";
}
}
