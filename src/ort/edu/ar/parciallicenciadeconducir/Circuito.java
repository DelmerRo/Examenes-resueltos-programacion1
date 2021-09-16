package ort.edu.ar.parciallicenciadeconducir;

public class Circuito implements Evaluable{
private static final int MAX_FALTAS = 2;
private int tiempoEnSegundos;
private int nroDeFaltas;
public Circuito(int tiempoEnSegundos, int nroDeFaltas) {
	super();
	this.tiempoEnSegundos = tiempoEnSegundos;
	this.nroDeFaltas = nroDeFaltas;
}
public int getTiempoEnSegundos() {
	return tiempoEnSegundos;
}
public void setTiempoEnSegundos(int tiempoEnSegundos) {
	this.tiempoEnSegundos = tiempoEnSegundos;
}
public int getNroDeFaltas() {
	return nroDeFaltas;
}
public void setNroDeFaltas(int nroDeFaltas) {
	this.nroDeFaltas = nroDeFaltas;
}
@Override
public String toString() {
	return "Circuito [tiempoEnSegundos=" + tiempoEnSegundos + ", nroDeFaltas=" + nroDeFaltas + "]";
}
@Override
public boolean aprobo() {
	return this.nroDeFaltas<=MAX_FALTAS;
}

}
