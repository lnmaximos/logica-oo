package br.com.logica.zoologico.classes;

public abstract class Animal {

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