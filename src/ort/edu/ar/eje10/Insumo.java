package ort.edu.ar.eje10;

public class Insumo implements Facturable {
	private String nombre;
	private double porDeGanancia;
	private double preDeLista;
	//private Tipo tipo;

	public Insumo(String nombre, double porDeGanancia, double preDeLista, Tipo tipo) {
		super();
		this.nombre = nombre;
		this.porDeGanancia = porDeGanancia;
		this.preDeLista = preDeLista;
	//	this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Insumo [nombre=" + nombre + ", porDeGanancia=" + porDeGanancia + ", preDeLista=" + preDeLista + "]";
	}

	@Override
	public double montoDeFacturacion() {
		double precio;
		precio = Matematica.sumarPorcentaje(preDeLista, this.porDeGanancia);
		return Matematica.sumarPorcentaje(precio, IVA);
	}

	@Override
	public String mostrarActividad() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName() + " nombre=" + this.nombre + ", porcentaje de ganancia="
				+ this.porDeGanancia + ", precio de Lista= " + this.preDeLista + "= ";
	}
}
