package ort.edu.ar.eje7;

public class PersonalSalarioFijo extends Personal {

	private static final int AÑO_ACTUAL = 2021;
	private static final double MENOR2 = 0;
	private static final double MAYORA2_Y_MENORIGUAL5 = 0.05;
	private static final double MAYORAIGUAL6_Y_MENORIGUAL10 = 0.1;
	private static final double MAYORA10 = 0.15;
	private double sueldoBasico;

	public PersonalSalarioFijo(String dNI, String nombre, String apellido, int añoDeIngreso, double sueldoBasico) {
		super(dNI, nombre, apellido, añoDeIngreso);
		this.sueldoBasico = sueldoBasico;
	}

	private double porcSegunAntiguedad() {
		double porcentaje = MENOR2;
		if (calcularDiferenciaDeAños() >= 2 && calcularDiferenciaDeAños() <= 5) {
			porcentaje = MAYORA2_Y_MENORIGUAL5;
		} else if (calcularDiferenciaDeAños() >= 6 && calcularDiferenciaDeAños() <= 10) {
			porcentaje = MAYORAIGUAL6_Y_MENORIGUAL10;
		} else if (calcularDiferenciaDeAños() > 10) {
			porcentaje = MAYORA10;
		}
		return porcentaje;
	}

	private double calcularDiferenciaDeAños() {
		return AÑO_ACTUAL - super.getAñoDeIngreso();
	}

	@Override
	public double getSalario() {
		return this.sueldoBasico + this.sueldoBasico * porcSegunAntiguedad();
	}

}
