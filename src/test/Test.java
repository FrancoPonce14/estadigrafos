package test;

import model.dataMethods;

public class Test {
	
	public static void main(String[] args) {
	
	dataMethods intervalo = new dataMethods();
	
	intervalo.agregarIntervalo(12.1, 12.6, 9);
	intervalo.agregarIntervalo(12.6, 13.1, 7);
	intervalo.agregarIntervalo(13.1, 13.6, 6);
	intervalo.agregarIntervalo(13.6, 14.1, 3); 
	

	intervalo.mostrarTabla();
	
	}
}
