package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio032 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for(int i =0; i<vetorA.length; i++) {
			System.out.println("Entre com a posi��o do VetorA");
			vetorA[i] = sc.nextInt();
		}
		
		for(int i =0; i<vetorA.length; i++) {
			
			System.out.println("Tabuada de " + vetorA[i]);
			
			for(int j=1; j<=10; j++) {
				System.out.println( j + " * " +vetorA[i] + " = " + vetorA[i]*j);
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
