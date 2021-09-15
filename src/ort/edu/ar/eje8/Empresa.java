package ort.edu.ar.eje8;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<EstacionPeaje>peajes;

	public Empresa() {
		super();
		this.peajes = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Empresa [peajes=" + peajes + "]";
	}
}
