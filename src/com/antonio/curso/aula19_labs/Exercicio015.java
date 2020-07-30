package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio015 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posição " +i);
			vetorA[i] = sc.nextInt();
			
		}
		int impar =0;
		for(int i = 0; i<vetorA.length;i++) {
			if(vetorA[i]%2 !=0) {
				impar++;
			}
			
		}
		int par = vetorA.length-impar;
		double porcPar = (par*100)/vetorA.length;
		double porcImpar = 100- porcPar;
		
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Porcentagem pares: " +porcPar);
		System.out.println("Porcentagem impares: " +porcImpar);
		
		
		
		
		sc.close();
	}

}
