package br.com.logica.zoologico.classes;

// construindo o objeto animal
public abstract class Animal {

	// atributos ou propriedade do objeto
	// nesse momento as propriedades sao publicas
	private String nome;
	private String especie;
	private int idade;
	private String corPelo;
	
	public Animal(String nome, String especie, int idade) {
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
	}
	
	//construtor padrao do java
	// não é recomendado utilizar o construtor padrao
	public Animal(){}
	
	// um construtor pode sofrer uma sobrecarga(sobrescrita)
	// isso consiste em criar varias versoes de um metodo
	// mantendo o nome dele, mas trocando a assinatura, quantidade de parametros que ele recebe
	public Animal(String nome) {
		this.nome = nome;
	}
	
	//metodos acessores
	// GETTERS E SETTERS
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	public String getCorPelo() {
		return corPelo;
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
	
	public abstract void emitirSom();
	
	public boolean isAdulto() {
		return idade >= 1;
	}
}