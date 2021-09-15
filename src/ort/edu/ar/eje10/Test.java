package ort.edu.ar.eje10;

public class Test {

	public static void main(String[] args) {
		Historial historial=new Historial();
		historial.agregarInsumos(new Insumo("Mouse", 10, 1000, Tipo.PERIFERICO));
		historial.agregarInsumos(new Insumo("teclado", 20, 2000, Tipo.PERIFERICO));
		historial.agregarInsumos(new Insumo("Notebook", 30, 100000, Tipo.HARDWARE));
		
		historial.agregarServicioDeArmado(new ServicioDeArmado(4));
		historial.agregarServicioDeArmado(new ServicioDeArmado(6));
		historial.agregarServicioDeArmado(new ServicioDeArmado(10));
		
		historial.agregarServicioDeArmado(new ServicioDeReparacion(10, 3));
		historial.agregarServicioDeArmado(new ServicioDeReparacion(12, 1));
		historial.agregarServicioDeArmado(new ServicioDeReparacion(1, 5));
				
		historial.montoTotalFacturado();
		System.out.println("\ncantidad de Servicios Simples: "+historial.cantServiciosSimples());
	}

}
