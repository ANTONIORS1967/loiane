package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio035 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição A");
			vetorA[i] = sc.nextInt();

		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Os divisores de " + vetorA[i]);
			for (int j = 1; j < vetorA.length; j++) {
				if (vetorA[i] % j == 0) {
					System.out.println( " é = " + j);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
