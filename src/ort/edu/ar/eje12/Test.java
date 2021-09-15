package ort.edu.ar.eje12;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		SoftwareSophie sophie = new SoftwareSophie();
		ArrayList<Metodo> listaMetodos = new ArrayList<>();
		ArrayList<Metodo> listaMetodos1 = new ArrayList<>();
		ArrayList<Metodo> listaMetodos2 = new ArrayList<>();

		Metodo m = new Metodo("buscar", 25, 37, 10);
		Metodo m1 = new Metodo("agregar", 12, 30, 100);
		Metodo m2 = new Metodo("buscar", 21, 88, 201);
		Metodo m3 = new Metodo("buscar", 23, 152, 10);

		Programa p = new Programa("01", "Word1.0", "Microsoft", false);
		Programa p1 = new Programa("02", "Excel1.0", "Microsoft", false);
		Programa p2 = new Programa("03", "Power1.0", "Microsoft", true);
		Programa p3 = new Programa("04", "Note1.1", "Linux", true);

		listaMetodos.add(m);
		listaMetodos.add(m1);
		listaMetodos.add(m2);

		listaMetodos1.add(m2);
		listaMetodos1.add(m3);
		listaMetodos1.add(m);

		listaMetodos2.add(m3);
		listaMetodos2.add(m1);
		listaMetodos2.add(m2);

		Fuente fp = new FuenteDeProgramacion("fpr1", "xy123", listaMetodos);
		Fuente fp1 = new FuenteDeProgramacion("fpr2", "xy124", listaMetodos1);
		Fuente fp2 = new FuenteDeProgramacion("fpr3", "xy125", listaMetodos2);

		Fuente fm = new FuenteDeMarcado("fdm1", "xy127", 1024);
		Fuente fm1 = new FuenteDeMarcado("fdm1", "xy128", 512);
		Fuente fm2 = new FuenteDeMarcado("fdm1", "xy129", 256);

		sophie.ingresarPrograma(p);
		sophie.ingresarPrograma(p1);
		sophie.ingresarPrograma(p2);
		sophie.ingresarPrograma(p3);

		p.agregarFuente(fp1);
		p.agregarFuente(fp2);
		p.agregarFuente(fm1);

		p1.agregarFuente(fp);
		p1.agregarFuente(fp1);
		p1.agregarFuente(fm2);

		p2.agregarFuente(fp2);
		p2.agregarFuente(fp1);
		p2.agregarFuente(fm);

		System.out.println(sophie);

	}

}
