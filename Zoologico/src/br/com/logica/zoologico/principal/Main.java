package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.classes.Animal;

public class Main {

	public static void main(String[] args) {
		// Criando uma nova instancia do objeto
		Animal a1 = new Animal();
		
		// atribuindo os valores as propriedades
		a1.setNome("jojo todinho");
		a1.setEspecie("gato");
		a1.setIdade(1);
		
		// criando uma nova instancia do objeto
		Animal a2 = new Animal();
		
		// atribuindo os valores as propriedades
		a2.setNome("spike");
		a2.setEspecie("cachorro");
		a2.setIdade(6);
		
		System.out.println("Ola o nome do meu cachorro é " + a2.getNome());
	
	}
}
