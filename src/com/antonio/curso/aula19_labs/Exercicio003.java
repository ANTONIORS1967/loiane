package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i =0; i<vetorA.length; i++) {
			System.out.println("Entre com a posiçao do vetor " +i);
			vetorA[i] = sc.nextInt();
			
			vetorB[i] = vetorA[i]*vetorA[i];
		}
	
			System.out.print("Vetor A = ");
			for( int i = 0; i<vetorA.length; i++) {
				System.out.print(vetorA[i] + " ");
			}
			System.out.print("Vetor B = ");
			for(int  i = 0; i<vetorB.length; i++) {
				System.out.print(vetorB[i] + " ");
			}
		
		
		sc.close();
	}

}
