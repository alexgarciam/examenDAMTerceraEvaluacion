package es.core.networks.dam.poo.examenTerceraEvaluacion.parte2;

public class Circulo extends FiguraGeometrica {

	int radio;
	
	@Override
	int calcularArea() {
		System.out.println("calculando el area del circulo");
		return 0;
	}

	@Override
	int calcularPerimetro() {
		super.calcularArea();
		System.out.println("calculando el perimetro del circulo");
		return 0;
	}
}
