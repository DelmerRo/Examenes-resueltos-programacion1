package ort.edu.ar.eje7;

import java.util.ArrayList;

public class PersonalAComision extends Personal{
private static final int MONTO_POR_CLIENTE = 8000;
private static final double SALARIO_MINIMO = 20000;
private ArrayList<Cliente>clientes;
	public PersonalAComision(String dNI, String nombre, String apellido, int añoDeIngreso) {
		super(dNI, nombre, apellido, añoDeIngreso);
		this.clientes=new ArrayList<Cliente>();
	}

	@Override
	public double getSalario() {
		double salario=this.clientes.size()*MONTO_POR_CLIENTE;
		return salario>SALARIO_MINIMO?salario:SALARIO_MINIMO;
	}

	public int cantCliente() {
		return this.clientes.size();	
	}
	public void agregarCliente(String cliente) {
		this.clientes.add(new Cliente(cliente));
		
	}

}
