package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio029 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorB.length*2];
		
		for(int i = 0; i<vetorA.length; i++) {			
			System.out.println("Entre com a posi��o  " +i);
			vetorA[i] = sc.nextInt();
			
			vetorC[i] = vetorA[i];
		}
		
		
		for(int i = 0; i<vetorB.length; i++) {			
			System.out.println("Entre com a posi��o  " +i);
			vetorB[i] = sc.nextInt();
			
			vetorC[vetorA.length +i]= vetorB[i];
		}
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		
		System.out.print("Vetor B = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor C = ");
		for(int i=0; i<vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();
		
		
		sc.close();
		
	}

}
