package ort.edu.ar.eje5;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Bicicleta>lista=new ArrayList<>();
	Bicicleta bicicleta=new Bicicleta("shimano", "kj500", 1500);
	Bicicleta bicicleta1=new Bicicleta("spx", "kj600", 2500);
	Bicicleta bicicleta2=new Bicicleta("top", "kj400", 1000);
	Bicicleta bicicleta3=new Bicicleta("rpx", "kj200", 1800);
	lista.add(bicicleta);
	lista.add(bicicleta1);
	lista.add(bicicleta2);
	lista.add(bicicleta3);
	
	BicicletaElectrica bicicletaE=new BicicletaElectrica("Elec-shi", "kj50", 150,200);
	BicicletaElectrica bicicletaE1=new BicicletaElectrica("Elec_mon", "kj40", 2500,150);
	BicicletaElectrica bicicletaE2=new BicicletaElectrica("Elec_ner", "kj30", 1847,300);
	BicicletaElectrica bicicletaE3=new BicicletaElectrica("Elec_pop", "kj80", 1254,110);
	lista.add(bicicletaE);
	lista.add(bicicletaE1);
	lista.add(bicicletaE2);
	lista.add(bicicletaE3);
	
	System.out.println(lista);
	
	Taller taller=new Taller(lista);
	System.out.println("Cantidad de servicios reparables: "+taller.cantServiciosPosibles(lista));
	}

}
