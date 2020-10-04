package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.heranca.Cachorro;
import br.com.logica.zoologico.heranca.Pato;

public class Main {

	public static void main(String[] args) {
		// Criando uma nova instancia do objeto
		Cachorro a1 = new Cachorro("Jojo Todinho", "Gato", 1);
		
		// atribuindo os valores as propriedades
		//a1.setNome("jojo todinho");
		//a1.setEspecie("gato");
		//a1.setIdade(1);
		
		System.out.println("Nome do animal " + a1.getNome());
		
		if(a1.isAdulto()) {
			System.out.println("É adulto");
		} else {
			System.out.println("Não é adulto");
		}
	
		Pato a2 = new Pato("Robert");
		a2.setEspecie("pato");
		a2.setIdade(7);
		
		System.out.println("Nome do animal " + a2.getNome() + ", é um " + a2.getEspecie() + " e tem " + a2.getIdade() + " anos");
		
	}
}
