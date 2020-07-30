package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio011 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posição do vetor A  " + i);
			vetorA[i] = sc.nextInt();

		}
		int qtdPar = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				qtdPar++;
			}
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println("Quantidade de números pares:" + qtdPar);

		sc.close();
	}

}
