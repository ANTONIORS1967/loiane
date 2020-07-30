package com.antonio.curso.aula24_labs;

public class Exercicio03 {

	public static void main(String[] args) {

		LivroLivraria livro =new LivroLivraria();
		
		livro.autor = "Jon Duckett";
		livro.capa = "Capa comum";
		livro.edicao = " fevereiro de 2016";
		livro.idioma = "Portugues";
		livro.isbn_10 = "8576089459";
		livro.isbn_13 = " 978-8576089452";
		livro.numPaginas = 640;
		livro.valor = 151.15;
		livro.peso = 1.5;
		
		System.out.println("O valor do livro: "+livro.valor);
	}

}
