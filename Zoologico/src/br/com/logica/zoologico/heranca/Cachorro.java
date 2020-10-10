package br.com.logica.zoologico.heranca;

import br.com.logica.zoologico.classes.Animal;

public class Cachorro extends Animal {

	public Cachorro(String nome, String especie, int idade) {
		super(nome, especie, idade);
	}

	public Cachorro(String nome) {
		super(nome);
	}
	
	@Override
	public void emitirSom() {
		if(estaVivo) {
			System.out.println("auau");
		}else {
			System.out.println("pereceu");
		}
	}
	
	@Override
	public boolean isAdulto() {
		if(isEstaVivo()) {
			return idade > 2;
		} else {
			return false;
		}
	}
	
	public void morrer() {
		this.estaVivo = false;
	}
}
