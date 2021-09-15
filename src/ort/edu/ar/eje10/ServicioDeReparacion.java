package ort.edu.ar.eje10;

public class ServicioDeReparacion extends Servicio{
	private static final double VALOR_POR_HORA=180;
	private static final double INCREMENTO=0.25;
	private int dificultad;
	private int cantHoras;
	public ServicioDeReparacion(int cantHoras,int dificultad) {
		super(cantHoras);
		this.dificultad=dificultad;
		this.cantHoras=cantHoras;
	}
	@Override
	public double montoDeFacturacion() {
		double montoAux=0;
		double monto=0;
		if(this.dificultad>0 &&this.dificultad<=3) {
			 montoAux=Matematica.sumarPorcentaje((valorPorHora()*super.getCantHoras()), INCREMENTO);
			monto=Matematica.sumarPorcentaje(montoAux, IVA);
		}else if(this.dificultad>3) {
			 montoAux=Matematica.sumarPorcentaje((valorPorHora()*super.getCantHoras()), INCREMENTO);
			monto=	Matematica.sumarPorcentaje(montoAux,IVA);
		}else {
			System.out.println("Numero fuera de rango!!");
		}
			
		return monto;
	}
	@Override
	public double valorPorHora() {
		return VALOR_POR_HORA;
	}
	@Override
	public String mostrarActividad() {
		
		return this.getClass().getSimpleName()+" Valor por hora="+ this.valorPorHora()+", cantidad de horas="+this.cantHoras+", dificultad="+this.dificultad+", Monto total Facturado= ";
	}
	public int getDificultad() {
		return dificultad;
	}
}
