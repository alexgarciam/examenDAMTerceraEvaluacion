package es.core.networks.dam.poo.examenTerceraEvaluacion.game;

public abstract class Enemigo implements Atacable{
	
		
	protected int fuerza;
	protected String raza;
	private int stamina;
	
	public static int numEnemigos=0;
	
	
	public Enemigo() {
		this.fuerza=10;
		this.stamina=10;
		this.raza="orco";
		
		numEnemigos++;
	}
	
	public boolean estaVivo() {
		return stamina>0;
	}

	public String getRaza() {
		return raza;
	}	
	
	@Override
	public void recibirAtaque(int num) {
		stamina-=num;
		if(!estaVivo())
			numEnemigos--;
	}
	
	
}
