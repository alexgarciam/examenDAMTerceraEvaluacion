package es.core.networks.dam.poo.examenTerceraEvaluacion.game;

import java.util.Objects;

public abstract class Heroe implements Atacable {

	protected int id;
	protected String name;	
	protected int stamina;	
	
	
	Heroe(){
		this.name="Alex";		
		this.stamina=100;
	}
	
	public Heroe(String name) throws HabilidadesInvalidasException {
		this.name=name;
	}
	
	public boolean estaVivo(){
		return stamina>0;
	}
	
	public  void pelear(Enemigo e) {
		System.out.println("Heroe "+name+" peleando con "+e.getRaza()+" con las manos");
	}

	


	
	
	
	
	
	
	
	
	
}
