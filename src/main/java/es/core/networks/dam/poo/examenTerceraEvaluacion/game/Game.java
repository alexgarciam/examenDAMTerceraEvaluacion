package es.core.networks.dam.poo.examenTerceraEvaluacion.game;

public class Game {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Heroe p1=new Guerrero();
		
		Heroe p2=new Hechicero();
		
		Enemigo e=new Orco();
		
		System.out.println("numero de enemigos 1 - "+Enemigo.numEnemigos);
		Enemigo e2=new Orco();
		System.out.println("numero de enemigos 2 - "+Enemigo.numEnemigos);
		
		Enemigo e3=new Orco();
		System.out.println("numero de enemigos 31 - "+Enemigo.numEnemigos);
		Enemigo e4=new Troll();
		System.out.println("numero de enemigos 4 - "+Enemigo.numEnemigos);
		
		
		p2.pelear(e);
		System.out.println("numero de enemigos"+Enemigo.numEnemigos);
		
		p2.pelear(e2);
		System.out.println("numero de enemigos"+Enemigo.numEnemigos);
		p2.pelear(e3);
		System.out.println("numero de enemigos"+Enemigo.numEnemigos);
		p2.pelear(e4);
		System.out.println("numero de enemigos"+Enemigo.numEnemigos);
		
		
		
	}

}
