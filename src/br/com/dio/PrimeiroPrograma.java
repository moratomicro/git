package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato("Miau", "Preto e Branco", 2);
		Gato gato2 = new Gato("Peste", "Malhado", 1);
		
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(gato2);
		System.out.println(livros);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello world! " + (a + b));*/
	}

}

class Livros {
	private String nome;
	private String npag;
}
