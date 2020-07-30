package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio010 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in); 
		
		int[] vetorA = new int[4];
		int[] vetorB = new int[vetorA.length];
	
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor do vetor A: " +i);
			vetorA[i] = sc.nextInt();
			
			
		}
		
		for(int i=0; i<vetorA.length; i++) {
			vetorB[i] = vetorA[i]%2;
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
			
		}
		System.out.print("Vetor B = ");
		for(int i=0; i<vetorB.length;i++) {
			System.out.print(vetorB[i] + " ");
			
		}
		
		
		sc.close();
		
		System.out.println();
	}

}
