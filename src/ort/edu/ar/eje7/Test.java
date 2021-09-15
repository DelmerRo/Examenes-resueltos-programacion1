package ort.edu.ar.eje7;

public class Test {

	public static void main(String[] args) {
		Aplicacion a=new Aplicacion();
		PersonalAComision pc=new PersonalAComision("1111", "Delmer", "Rodriguez", 2000);
		PersonalAComision pc1=new PersonalAComision("2222", "Manuel", "Rodriguez", 2010);
		PersonalAComision pc2=new PersonalAComision("3333", "Jorge", "Perez", 2021);
		
		PersonalSalarioFijo psf=new PersonalSalarioFijo("4444", "Melina", "Chavez", 2015, 15000);
		PersonalSalarioFijo psf1=new PersonalSalarioFijo("5555", "Cecilia", "Manop", 2018, 20000);
		PersonalSalarioFijo psf2=new PersonalSalarioFijo("6666", "Sofia", "Gonzalez", 2005,30000);
		
		pc.agregarCliente("Jimena");
		pc.agregarCliente("Laura");
		pc.agregarCliente("Natali");
		pc1.agregarCliente("Jessica");
		pc2.agregarCliente("Mirta");
		pc2.agregarCliente("Fabiola");
		
		a.agregarPersonal(pc);
		a.agregarPersonal(pc1);
		a.agregarPersonal(pc2);
		
		a.agregarPersonal(psf);
		a.agregarPersonal(psf1);
		a.agregarPersonal(psf2);
		
		a.getSalario();
		a.personalConMasClientes();
	}

}
