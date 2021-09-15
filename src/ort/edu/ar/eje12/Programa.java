package ort.edu.ar.eje12;

import java.util.ArrayList;

public class Programa implements Calificable {
	private String id;
	private String nombre;
	private String nomResponsable;
	private boolean flag;
	private ArrayList<Fuente> fuentes;

	public Programa(String id, String nombre, String nomResponsable, boolean flag) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nomResponsable = nomResponsable;
		this.flag = flag;
		this.fuentes = new ArrayList<>();
	}

	public void agregarFuente(Fuente f) {
		this.fuentes.add(f);
	}

	@Override
	public String toString() {
		return "Programa [id=" + id + ", nombre=" + nombre + ", nomResponsable=" + nomResponsable + ", flag=" + flag
				+ ", fuentes=" + fuentes + "]";
	}

	@Override
	public double indiceDeCalidad() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void mostrarDetalleDeMetodo(String nombreMetodo) {
		Metodo metodoEncontrado = this.buscarMetodo(nombreMetodo);
		metodoEncontrado.getCantInstrucciones();
		metodoEncontrado.getCantParametros();
		metodoEncontrado.getCantRamDeFlujo();
		metodoEncontrado.indiceDeCalidad();
	}

	private Metodo buscarMetodo(String nombreMetodo) {
		int i = 0;
		Metodo metodoEncontrado = null;
		while (i < this.fuentes.size() && metodoEncontrado == null
				&& this.fuentes.get(i) instanceof FuenteDeProgramacion) {
			FuenteDeProgramacion fuenteAux = (FuenteDeProgramacion) this.fuentes.get(i);
			Metodo metodoAux = fuenteAux.dameTuMetodo(nombreMetodo);
			if (metodoAux != null) {
				metodoEncontrado = metodoAux;
			} else {
				i++;
			}
		}
		return metodoEncontrado;
	}

}
