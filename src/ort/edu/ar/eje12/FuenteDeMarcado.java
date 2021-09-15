package ort.edu.ar.eje12;

public class FuenteDeMarcado extends Fuente {
	private double tamañoArchivoEnKB;

	public FuenteDeMarcado(String nombre, String ubicacion,double tamañoArchivoEnKB) {
		super(nombre, ubicacion);
		this.tamañoArchivoEnKB=tamañoArchivoEnKB;
	}

	@Override
	public String toString() {
		return "\nFuenteDeMarcado [tamañoArchivoEnKB=" + tamañoArchivoEnKB + "]";
	}

	@Override
	public double indiceDeCalidad() {
		// TODO Auto-generated method stub
		return 0;
	}

}
