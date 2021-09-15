package ort.edu.ar.eje9;

public class Test {

	public static void main(String[] args) {
		Puerto puerto=new Puerto(1000, 200);
		Barco barco=new BarcoVelero("r123", 2.5, 1950, "Carlos", 3);
		Barco barco1=new BarcoVelero("r124", 3, 1980, "Delmer", 5);

		Barco barco2=new BarcoDeportivo("r125", 3.5, 2010, "Juan", 1500, 1500);
		Barco barco3=new BarcoDeportivo("r126", 4, 2021, "Sebastian", 10000, 30);

		Barco barco4=new BarcoYate("r127", 5.7, 1985, "Lucas", 10);
		Barco barco5=new BarcoYate("r128", 1, 1995, "Mena", 4);
		
		Barco barco6=new BarcoDeportivoDeLujo("r127", 5.7, 1985, "Lucas", 6000, 80);
		Barco barco7=new BarcoDeportivoDeLujo("r128", 1, 1995, "Mena", 10000, 50);
		
		puerto.agregarAmarra(new Amarra(1,"up",barco));
		puerto.agregarAmarra(new Amarra(1,"up",barco1));

		puerto.agregarAmarra(new Amarra(1,"up",barco2));
		puerto.agregarAmarra(new Amarra(1,"up",barco3));

		puerto.agregarAmarra(new Amarra(1,"up",barco4));
		puerto.agregarAmarra(new Amarra(1,"up",barco5));
		
		puerto.agregarAmarra(new Amarra(1,"up",barco6));
		puerto.agregarAmarra(new Amarra(1,"up",barco7));
		
		puerto.asignarPrecioBase(1500);
		puerto.asignarPrecioAdicional(100);
		
		System.out.println("cantidad de barcos con valor total mayor a $8000"+puerto.barcosConAlquilerMayorA(8000));
		System.out.println(puerto.barcoConMayorConsumo());
	}

}
