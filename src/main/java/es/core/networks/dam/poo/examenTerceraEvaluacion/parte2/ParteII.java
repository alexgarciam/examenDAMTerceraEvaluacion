package es.core.networks.dam.poo.examenTerceraEvaluacion.parte2;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class ParteII {

	
	static String datos="hola.rm;usuarios.rm;test.txt;texto.rm;claves.rm;cosas.java;gatitos.rm;perritos.java;saludos.txt;adios.rm;fuego.txt;taza.java;java.txt;cuanto.txt;trece.java;";
	
	static void getNumeroExtensiones(){
		String[] ficheros=datos.split(";");
		Hashtable dic=new Hashtable<>();
		for (String string : ficheros) {
			String[] partes=string.split("\\.");
			if(dic.containsKey(partes[1])) {
				int t=(Integer)dic.get(partes[1]);
				dic.put(partes[1], t+1);
			}else {
				dic.put(partes[1], 1);
			}
		}
		
		Enumeration e=dic.keys();
		while(e.hasMoreElements()) {
			String ext=(String)e.nextElement();
			System.out.println(dic.get(ext));
		}
	}
	
	

	private static void sumaMatrices(int[][] mx1, int[][] mx2) {
		int[][] matrizSuma = new int[mx1.length][mx1[0].length];
		for (int y = 0; y < mx1.length; y++) {
			for (int x = 0; x < mx1[y].length; x++) {
				int numeroMatriz1 = mx1[y][x];
				int numeroMatriz2 = mx2[y][x];
				int suma = numeroMatriz1 + numeroMatriz2;
				matrizSuma[y][x] = suma;
			}
		}

		// Finalmente imprimir los resultados
		for (int y = 0; y < mx1.length; y++) {
			for (int x = 0; x < mx1[y].length; x++) {
				System.out.printf("%5d ", mx1[y][x]);
			}
			System.out.print(" | ");

			for (int x = 0; x < mx2[y].length; x++) {
				System.out.printf("%5d ", mx2[y][x]);
			}
			System.out.print(" | ");

			for (int x = 0; x < matrizSuma[y].length; x++) {
				System.out.printf("%5d ", matrizSuma[y][x]);
			}
			System.out.print(" | ");
			System.out.println();
		}
	}

	
	
	public static void main(String[] args) {
		
		
		int[][] mx1 = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int[][] mx2 = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		sumaMatrices(mx1, mx2);
		
		getNumeroExtensiones();
	}

}
