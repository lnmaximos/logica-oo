package br.com.logica.zoologico.desafios;
import java.util.Scanner;

    /*
    Informe abaixo uma classe chamada Programador, que respeite as regras abaixo:
    Contenha uma propriedade privada linguagem textual;
    A proprieade deve ser iniciada no construtor da classe;
    Sobrescreva o m�todo showInfo() da superclasse;
    Exiba os dados do "Programador".
    Entrada de dados
    Carlos Silva
    33
    Java
    Sa�da esperada
    Carlos Silva
    33
    Java
    Dica: Utilize a cl�usula super para acessar membros da classe herdada.
     */

	class PessoaDesafio {
		private String nome;
		private int idade;
		
		public PessoaDesafio(String nome, int idade) {
			
		}

	}
	
	class ProgramadorDesafio extends PessoaDesafio {
		
		private String linguagem;
		
		public ProgramadorDesafio(String nome. int idade) {
			super(nome, idade);
		}
				
	}
	
public class DesafioHerancaConstrutor {
	
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        PessoaDesafio a = new ProgramadorDesafio(scann.nextLine(), Integer.valueOf(scann.nextLine()), scann.nextLine());

        a.showInfo();
    }
}