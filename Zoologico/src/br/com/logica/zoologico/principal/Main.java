package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.heranca.Cachorro;
import br.com.logica.zoologico.heranca.Pato;

public class Main {

	public static void main(String[] args) {
		// Criando uma nova instancia do objeto
		Cachorro a1 = new Cachorro("Jojo Todinho", "Gato", 1, "Branco");
		
		// atribuindo os valores as propriedades
		//a1.setNome("jojo todinho");
		//a1.setEspecie("gato");
		//a1.setIdade(1);
		
		System.out.println("Nome do animal " + a1.getNome());
		// criando uma nova instancia do objeto
		Cachorro a2 = new Cachorro("Spike", "Cachorro", 3, "Preto");
		
		// atribuindo os valores as propriedades
		//a2.setNome("spike");
		//a2.setEspecie("cachorro");
		//a2.setIdade(6);
		
		a2.emitirSom();
		
		System.out.println("Ola o nome do meu cachorro é " + a2.getNome());
		
		if(a2.isAdulto()) {
			System.out.println("É adulto");
		} else {
			System.out.println("Não é adulto");
		}
	
		Pato a3 = new Pato("Robert");
		a3.setEspecie("pato");
		a3.setIdade(7);
		
		System.out.println("Nome do animal " + a3.getNome() + ", é um " + a3.getEspecie() + " e tem " + a3.getIdade() + " anos");
		
	}
}
