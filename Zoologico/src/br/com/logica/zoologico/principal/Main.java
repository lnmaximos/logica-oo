package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.classes.Animal;

public class Main {

	public static void main(String[] args) {
		// Criando uma nova instancia do objeto
		Animal a1 = new Animal();
		// atribuindo os valores as propriedades
		a1.nome = "jojo todinho";
		a1.especie = "gato";
		a1.idade = 1;
		
		// criando uma nova instancia do objeto
		Animal a2 = new Animal();
		// atribuindo os valores as propriedades
		a2.nome = "spike";
		a2.especie = "cachorro";
		a2.idade = 6;
	
	}
}
