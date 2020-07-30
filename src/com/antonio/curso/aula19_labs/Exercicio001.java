package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i<vetorA.length;i++) {
			System.out.println("Entre com o valo da posição " +i);
			vetorA[i] = sc.nextInt();
			
			vetorB[i] = vetorA[i];
		}
		
		System.out.print("Vetor A = ");
		for(int i =0; i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.print("Vetor B = ");
		for(int i =0; i<vetorB.length;i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		sc.close();
	}

}
