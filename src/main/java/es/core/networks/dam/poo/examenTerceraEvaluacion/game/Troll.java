package es.core.networks.dam.poo.examenTerceraEvaluacion.game;

public class Troll extends Enemigo {

	
public static int numTrolls;
	
	{
		numTrolls=0;
	}
	
	Troll(){
		super();
		this.raza="troll";
		numTrolls++;
	}
}
