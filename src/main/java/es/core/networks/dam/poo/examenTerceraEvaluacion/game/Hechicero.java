package es.core.networks.dam.poo.examenTerceraEvaluacion.game;

public class Hechicero extends Heroe {

	
	Hechizo hechizo;

	Hechicero(){
		super();
		this.hechizo=new Hechizo();
	}
	
	Hechicero(String name){
		this();
		this.name=name;
		this.hechizo=new Hechizo();
		
	}
	
	Hechicero(Hechizo hechizo){
		this();
		this.hechizo=hechizo;
		
	}
	
	Hechicero(String name, Hechizo hechizo){
		this();
		this.name=name;
		this.hechizo=hechizo;
	}
		
	
	public  void pelear(Enemigo e) {
		System.out.println("Guerrero "+name+" peleando con "+e.getRaza()+" con las el hechizo "+hechizo.getName());
		
		while(e.estaVivo()) {
			e.recibirAtaque(hechizo.getDaño());
			this.recibirAtaque(e.atacar);
		}

		System.out.println("has matado a un"+e.getRaza());
	}

	@Override
	public void recibirAtaque(int num) {
		// TODO Auto-generated method stub
		
	}

	
}
