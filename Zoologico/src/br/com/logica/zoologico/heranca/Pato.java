package br.com.logica.zoologico.heranca;

import br.com.logica.zoologico.classes.Animal;

public class Pato extends Animal {

	public Pato(String nome, String especie, int idade) {
		super(nome, especie, idade);
	}

	public Pato(String nome) {
		super(nome);
	}
	
	@Override
	public void emitirSom() {
		if(estaVivo) {
			System.out.println("quac quac");
		}else {
			System.out.println("pereceu");
		}
	}
	
	@Override
	public boolean isAdulto() {
		if(isEstaVivo()) {
			return idade > 1;
		} else {
			return false;
		}
	}
	public void morrer() {
		this.estaVivo = false;
	}
}
