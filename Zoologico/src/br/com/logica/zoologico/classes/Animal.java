package br.com.logica.zoologico.classes;

// construindo o objeto animal
public class Animal {

	// atributos ou propriedade do objeto
	// nesse momento as propriedades sao publicas
	private String nome;
	private String especie;
	private int idade;
	
	public Animal(String nome, String especie, int idade) {
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
	}
	
<<<<<<< HEAD
	//construtor padrao do java
	// n�o � recomendado utilizar o construtor padrao
	public Animal(){}
	
	// um construtor pode sofrer uma sobrecarga(sobrescrita)
	// isso consiste em criar varias versoes de um metodo
	// mantendo o nome dele, mas trocando a assinatura, quantidade de parametros que ele recebe
	public Animal(String nome) {
		this.nome = nome;
	}
=======
>>>>>>> cd2108154fce8b2e805b92aa0e74f863bcf7dc1e
	
	//metodos acessores
	// GETTERS E SETTERS
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void emitirSom() {
		System.out.println("Som do animal");
	}
	
	public boolean isAdulto() {
		return idade >= 1;
	}
}