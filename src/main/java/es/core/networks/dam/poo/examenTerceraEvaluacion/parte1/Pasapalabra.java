package es.core.networks.dam.poo.examenTerceraEvaluacion.parte1;

import java.util.Scanner;

public class Pasapalabra {

	String frase;
	StringBuffer fraseCoded;
	String scanString;

	public Pasapalabra(String frase) {
		this.frase = frase.trim().toLowerCase();
		fraseCoded = new StringBuffer(this.frase);

		for (int i = 0; i < this.frase.length(); i++) {

			if (this.frase.charAt(i) == ' ')
				fraseCoded.setCharAt(i, ' ');
			else
				fraseCoded.setCharAt(i, '_');
		}

	}

	void muestraFrase() {
		System.out.println("averiguar: " + fraseCoded);
	}

	void muestraMenu() {
		System.out.println("1.- Letra");
		System.out.println("2.- Resolver");
	}
	
	void pintar() {
		
	}

	void leerOpcionMenu() {
		Scanner scanner = new Scanner(System.in);

		// print the next line
		scanString = scanner.nextLine();
		int num=Integer.parseInt(scanString);
		System.out.println("ha elegido la opcion " + scanString);

		switch (num) {
		case 1: {

			System.out.println("introduca letra");
			scanString = scanner.nextLine();
			
			
			break;

		}
		case 2: {

			System.out.println("introduca el string");
		
			break;

		}
		default:

			throw new IllegalArgumentException("Unexpected value: " + Integer.parseInt(scanString));
			
		}

	}

	void pideLetra() {
		// with the specified String Object
		

	}

	boolean resuelve(String fraseInput) {
		return fraseInput.trim().equalsIgnoreCase(frase);
	}

	public static void main(String[] args) {

		System.out.println("intenta acertar la frase!!");

		Pasapalabra p1 = new Pasapalabra("la clase de DAM");
		p1.muestraFrase();

		boolean acertado = false;
		while (!acertado) {
			p1.muestraMenu();
			p1.leerOpcionMenu();
		}

	}

}
