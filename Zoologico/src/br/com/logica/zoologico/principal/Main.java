package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.heranca.Cachorro;
import br.com.logica.zoologico.heranca.Pato;

public class Main {

	public static void main(String[] args) {
		// Criando uma nova instancia do objeto
		Cachorro a1 = new Cachorro("Jojo Chocoleite", "Cachorro", 3);
		
		// atribuindo os valores as propriedades
		//a1.setNome("jojo todinho");
		//a1.setEspecie("gato");
		//a1.setIdade(1);
		
		System.out.println("Nome do animal " + a1.getNome() + ", é um " + a1.getEspecie() + " e tem " + a1.getIdade() + " anos");
		
		a1.emitirSom();
		
		if(a1.isAdulto()) {
			System.out.println("É adulto");
		} else {
			System.out.println("Não é adulto");
		}
		System.out.println("-----------------------------------------------------");
			
		Pato a2 = new Pato("Robert");
		a2.setEspecie("pato");
		a2.setIdade(2);
		
		System.out.println("Nome do animal " + a2.getNome() + ", é um " + a2.getEspecie() + " e tem " + a2.getIdade() + " anos");
		
		a2.emitirSom();
		
		if(a2.isAdulto()) {
			System.out.println("É adulto");
		} else {
			System.out.println("Não é adulto");
		}
		
	}
}
