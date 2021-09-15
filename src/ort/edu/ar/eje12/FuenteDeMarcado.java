package ort.edu.ar.eje12;

public class FuenteDeMarcado extends Fuente {
	private double tama�oArchivoEnKB;

	public FuenteDeMarcado(String nombre, String ubicacion,double tama�oArchivoEnKB) {
		super(nombre, ubicacion);
		this.tama�oArchivoEnKB=tama�oArchivoEnKB;
	}

	@Override
	public String toString() {
		return "\nFuenteDeMarcado [tama�oArchivoEnKB=" + tama�oArchivoEnKB + "]";
	}

	@Override
	public double indiceDeCalidad() {
		// TODO Auto-generated method stub
		return 0;
	}

}
