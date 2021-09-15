package ort.edu.ar.eje12;

public class Metodo implements Calificable{
private String nombre;
private int cantParametros;
private int cantInstrucciones;
private int cantRamDeFlujo;
public Metodo(String nombre, int cantParametros, int cantInstrucciones, int cantRamDeFlujo) {
	super();
	this.nombre = nombre;
	this.cantParametros = cantParametros;
	this.cantInstrucciones = cantInstrucciones;
	this.cantRamDeFlujo = cantRamDeFlujo;
}
public String getNombre() {
	return nombre;
}
public int getCantParametros() {
	return cantParametros;
}
public int getCantInstrucciones() {
	return cantInstrucciones;
}
public int getCantRamDeFlujo() {
	return cantRamDeFlujo;
}
@Override
public String toString() {
	return "Metodo [nombre=" + nombre + ", cantParametros=" + cantParametros + ", cantInstrucciones="
			+ cantInstrucciones + ", cantRamDeFlujo=" + cantRamDeFlujo + "]";
}
@Override
public double indiceDeCalidad() {
	// TODO Auto-generated method stub
	return 0;
}

}
