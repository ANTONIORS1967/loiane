package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i =0; i<vetorA.length; i++) {
			System.out.println("Entre com a posição do vetor " +i);
			vetorA[i] = sc.nextInt();
			
			vetorB[i] =(int) Math.sqrt(vetorA[i]);	
			
		}
		System.out.print("Vetor A = ");
		for(int i =0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] +" ");
		}
		System.out.print("VetorB = ");
		for(int i =0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] +" ");
		}
		
		sc.close();
	}

}
