package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato gato = new Gato();
		Livros livro = new Livros();
		
		System.out.println(gato);

		System.out.println(livro);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Wello world " + (a + b));*/
	}

}

class Livros {
	private String nome;
	private String npag;
}
