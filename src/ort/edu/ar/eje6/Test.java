package ort.edu.ar.eje6;
public class Test {

	public static void main(String[] args) {
		Figura fe=new Figura();
		TrianguloEquilatero te=new TrianguloEquilatero("Rojo", 50);
		Circunferencia cir=new Circunferencia("Verde", 100);
		Rectangulo rec=new Rectangulo("azul", 50, 20);
		
		fe.agregarFigura(te);
		fe.agregarFigura(cir);
		fe.agregarFigura(rec);
		fe.mostrarTodo();
	
	}

}
