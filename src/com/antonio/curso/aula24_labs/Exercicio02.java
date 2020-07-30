package com.antonio.curso.aula24_labs;

public class Exercicio02 {

	public static void main(String[] args) {

		Livro livro =new Livro();
		
		livro.autor = "Carlos Drumont de Andrade";
		livro.editora = "Saraiva";
		livro.genero = "Romance";
		livro.paginas = 870;
		livro.tipoCapa = "Capa dura";
		livro.titulo = "O amor está no Ar";
	
		System.out.println("O nome do autor: " + livro.autor);
	}

}
