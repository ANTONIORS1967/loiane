package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio036 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[11];

		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = (int)Math.pow(2, i);

		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("(" +vetorA[i] + ") ");
		}
		System.out.println();
		sc.close();
	}
	

}
