package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio009 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in); 
		
		int[] vetorA = new int[4];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorB.length];
		
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor do vetor A: " +i);
			vetorA[i] = sc.nextInt();
			
			
		}
		for(int i = 0; i<vetorB.length; i++) {
			System.out.println("Entre com o valor do vetor B: " +i);
			vetorB[i] = sc.nextInt();
			
			
		}
		for(int i=0; i<vetorA.length; i++) {
			vetorC[i] = vetorA[i]/vetorB[i];
		}
		
		System.out.println("Vetor A = ");
		for(int i=0; i<vetorA.length;i++) {
			System.out.println(vetorA[i] + " ");
			
		}
		System.out.println("Vetor B = ");
		for(int i=0; i<vetorB.length;i++) {
			System.out.println(vetorB[i] + " ");
			
		}
		System.out.println("Vetor C = ");
		for(int i=0; i<vetorC.length;i++) {
			System.out.println(vetorC[i] + " ");
			
		}
		
		sc.close();
		
		System.out.println();
	}

}
