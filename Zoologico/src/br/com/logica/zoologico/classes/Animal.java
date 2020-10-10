package br.com.logica.zoologico.classes;

// construindo o objeto animal
public abstract class Animal {

	// atributos ou propriedade do objeto
	// nesse momento as propriedades sao publicas
	private String nome;
	private String especie;
	protected int idade;
	protected boolean estaVivo;
	
	public Animal(String nome, String especie, int idade) {
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
		this.estaVivo = true;
	}
	
	//construtor padrao do java
	// não é recomendado utilizar o construtor padrao
	public Animal(){}

	public Animal(String nome) {
		this.nome = nome;
		this.estaVivo = true;
	}
	
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
	
	public boolean isEstaVivo() {
		return estaVivo;
	}
}