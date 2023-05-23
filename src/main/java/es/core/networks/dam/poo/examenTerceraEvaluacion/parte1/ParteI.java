package es.core.networks.dam.poo.examenTerceraEvaluacion.parte1;

import java.util.Iterator;

public class ParteI {

	private static void buscaPalabraMayorYMenor(String[] array) {

		String mayor = array[0];
		String menor = array[0];
		for (int i = 1; i < array.length; i++) {
			if (mayor.compareTo(array[i]) > 0)
				mayor = array[i];
			else if (menor.compareTo(array[i]) < 0)
				mayor = array[i];
		}
		System.out.println("menor: " + menor);
		System.out.println("mayor: " + mayor);
	}

	public static void usoStringBuffer() {
		StringBuffer st = new StringBuffer("12344576");
		st.reverse();
		System.out.println(st);
		st.insert(4, '.');
		Float ft = Float.valueOf(st.toString());
		System.out.println(ft.doubleValue());

	}

	public static void main(String[] args) {

		char[] nombre = { 'a', 'l', 'e', 'x' };
		char[] apellido1 = { 'g', 'a', 'r', 'c', 'i', 'a' };
		char[] apellido2 = { 'm', 'a', 'r', 'c', 'h', 'e', 'n', 'a' };

		System.out.println("logintud del apellido1 " + apellido1.length + " : " + apellido1);

		String dam1 = "DAM";
		String dam2 = new String("DAM");

		// array de STrings
		String[] myArrayStrings = { "esta", "es", "la", "clase", "de", "poo" };

		// concat
		String concat = myArrayStrings[0].concat(myArrayStrings[2]);
		System.out.println(concat);

		buscaPalabraMayorYMenor(myArrayStrings);

		

		usoStringBuffer();

		contieneEspacios("esto es una oracion");
	}

	private static void contieneEspacios(String st) {
		char c = ' ';
		int espacios = 0;
		StringBuffer test = new StringBuffer(st);
		for (int i = 0; i < test.length(); i++) {
			if (test.charAt(i) == c) {
				espacios++;
				test.deleteCharAt(i);
			}
		}
		System.out.println("numero de espacios: "+espacios);
		System.out.println("sin esapcios: "+test);
	}
	
	}
