package com.antonio.curso.aula24_labs;

public class Exercicio04 {

	public static void main(String[] args) {

LivroBiblioteca livroEmprestado =new LivroBiblioteca();
		
livroEmprestado.autor = "Carlos Drumont de Andrade";
livroEmprestado.editora = "Saraiva";
livroEmprestado.genero = "Romance";
livroEmprestado.paginas = 870;
livroEmprestado.tipoCapa = "Capa dura";
livroEmprestado.titulo = "O amor está no Ar";
livroEmprestado.emprestado = true;
livroEmprestado.emprestadoA = "Antonio";

		System.out.println("O foi emprestado a : " + livroEmprestado.emprestadoA );
	}

}
