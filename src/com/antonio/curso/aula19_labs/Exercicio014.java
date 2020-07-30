package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio014 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in); 
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i<vetorA.length;i++) {
			System.out.println("Entre com a posição do vetor A  "+i);
			vetorA[i] = sc.nextInt();
			
			
		}
		int impares = 0;
		int  soma =0;
		for(int i =0; i<vetorA.length;i++) {
			
			if(vetorA[i]%(2) !=0) {
				soma += vetorA[i];
				impares++;
			}
		}
			System.out.print("Vetor A = ");
			for(int i = 0; i<vetorA.length;i++) {
				System.out.print(vetorA[i] + " + ");
			}
			System.out.println(" ");
	
		System.out.println("Soma: ( " +soma+ " ) ");
		System.out.println("Média " +soma/impares);
		
		sc.close();
	}

}
