package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio025 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i =0; i<vetorA.length;i++) {
			
			System.out.println("Entre com um n�meoro para a posi��o " +i);			
			vetorA[i] = sc.nextInt();
			
			vetorB[i] = (vetorA[i]%2==0) ?1 :0; 
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
		
		sc.close();
	}

}
