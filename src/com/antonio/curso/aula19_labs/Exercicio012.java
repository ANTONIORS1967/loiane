package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i<vetorA.length;i++) {
			System.out.println("Entre com a posição do vetor A  "+i);
			vetorA[i] = sc.nextInt();
			
			
		}
		int  soma =0;
		for(int i =0; i<vetorA.length;i++) {
			soma += vetorA[i];
		}
			System.out.print("Vetor A = ");
			for(int i = 0; i<vetorA.length;i++) {
				System.out.print(vetorA[i] + " ");
			}
	
		System.out.println("Quantidade de números pares:" +soma);
		
		sc.close();
	}
	
}
