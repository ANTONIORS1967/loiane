package com.antonio.curso.aula24_labs;

public class Exercicio06 {

	public static void main(String[] args) {

		ContatoMeuCelular  contato = new ContatoMeuCelular();
		
		contato.contatoAtivo = true;
		contato.nome = "João Pedro";
		
		contato.numeroTelefone = new String[5];
		contato.numeroTelefone[0] = "4338756";
		contato.numeroTelefone[1] = "3976553";
		
		System.out.println("O contato :" + contato.numeroTelefone[1]);
		
	}

}
