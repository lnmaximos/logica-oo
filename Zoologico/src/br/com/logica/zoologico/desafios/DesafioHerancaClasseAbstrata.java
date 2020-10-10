package br.com.logica.zoologico.desafios;
import java.util.Scanner;

	abstract class Livro {
		protected String titulo;
	
		public abstract void setTitulo(String s);
		
		public String getTitulo() {
			return titulo;
			}
	}

	class MeuLivro extends Livro {
		
		@Override	
		public void setTitulo(String s) {
				this.titulo = s;
			}
	}
	
public class DesafioHerancaClasseAbstrata {
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		Livro a = new MeuLivro();
		a.setTitulo(scann.nextLine());
		
		System.out.println(a.getTitulo());
	}
}