package es.core.networks.dam.poo.examenTerceraEvaluacion.game;

import java.util.Objects;

public  class Arma {	
	
	int daño;	
	String name;
	
	public Arma() {
		this.name="espada";
		this.daño=1;
	}
		
	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arma other = (Arma) obj;
		return daño == other.daño && Objects.equals(name, other.name);
	}	
	
	
}
