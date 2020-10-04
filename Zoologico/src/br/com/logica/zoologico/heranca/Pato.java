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
		// TODO Auto-generated method stub
	System.out.println("quac quac");	
	}
	
}