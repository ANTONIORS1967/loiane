package com.antonio.curso.aula20_labs;

import java.util.Scanner;

public class Exercicio006 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[][] jogoVelha = new char[3][3];

		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");

		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0;
		int coluna = 0;

		while (!ganhou) {
			if (jogada % 2 == 1) {// jogador 1
				System.out.println("Vez do jogador 1, escolha linha e coluna (1-3)");
				sinal = 'X';
			} else {// jogador 2
				System.out.println("Vez do jogador 2, escolha linha e coluna (1-3)");
				sinal = 'O';
			}
			boolean linhaValida = false;

			while (!linhaValida) {
				System.out.println("Entre com a linha 1, 2 ou 3");
				linha = sc.nextInt();
				if (linha > 0 && linha < 4) {
					linhaValida = true;
				} else {
					System.out.println("Entrada inválida, tente novamente:");
				}
			}
			boolean colunaValida = false;

			while (!colunaValida) {
				System.out.println("Entre com a coluna 1, 2 ou 3");
				coluna = sc.nextInt();
				if (coluna > 0 && coluna < 4) {
					colunaValida = true;
				} else {
					System.out.println("Entrada inválida, tente novamente:");
				}
			}
			linha--;
			coluna--;
			if(jogoVelha[linha][coluna]== 'X'||jogoVelha[linha][coluna]== 'O' ) {
				System.out.println("Posição já usada, tente novamente:");
			}else {
				jogoVelha[linha][coluna]=sinal;
				jogada++;
			}
			//imprimir o tabuleiro
			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j] + " | " );

				}
				System.out.println();
			}
			if((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X')||
					(jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X')||
					(jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X')||
					(jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X')||
					(jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X')||
					(jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X')||
					(jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')) {
				ganhou = true;
				System.out.println("Parabéns o jogador 1 ganhou!");
				
			}else if((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O')||
					(jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O')||
					(jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O')||
					(jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O')||
					(jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O')||
					(jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O')||
					(jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')) {
				ganhou = true;
				System.out.println("Parabéns o jogador 2 ganhou!");
			}else if(jogada>9){
				ganhou =true;
				System.out.println("Ninguem ganhou esssa partida.");
			}
		}
		

		sc.close();
	}

}
