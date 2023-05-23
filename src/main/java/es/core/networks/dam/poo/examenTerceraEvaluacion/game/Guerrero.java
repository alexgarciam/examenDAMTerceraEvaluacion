package es.core.networks.dam.poo.examenTerceraEvaluacion.game;

import java.util.Objects;

public class Guerrero extends Heroe  {

	Arma arma;
		
	Guerrero(){
		super();
		this.arma=new Arma();
	}
	
	Guerrero(String name){
		this();
		this.name=name;
		
	}
	
	Guerrero(Arma arma){
		this();
		this.arma=arma;
		
	}
	
	Guerrero(String name, Arma arma){
		this();
		this.name=name;
		this.arma=arma;
	}
		
	
	public void pelear(Enemigo e) {
		System.out.println("Guerrero "+name+" peleando con "+e.getRaza()+" con las el arma "+arma.getName());
		
		while(e.estaVivo()) {
			e.recibirAtaque(arma.getDaño());
		}
		System.out.println("has matado a un"+e.getRaza());
	}

	@Override
	public void recibirAtaque(int num) {
		// TODO Auto-generated method stub
		
	}

	
	
}
