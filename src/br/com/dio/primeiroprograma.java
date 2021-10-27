package br.com.dio;

import br.com.dio.model.gato;

public class primeiroprograma {

	public static void main(String[] args) {
			gato gato = new gato();
			livros livros = new livros();
		/*int a=2;
		int b=3;
		System.out.println("Hello world "+(a+b));*/
			
			System.out.println(gato);
			System.out.println(livros);
	}

}

class livros{
	private String nome;
	private String npag;
}