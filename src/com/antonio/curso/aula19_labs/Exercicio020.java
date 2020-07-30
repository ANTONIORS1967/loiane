package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio020 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Entre com a cotação do dolar");
		cotacao = sc.nextDouble();
		
		for(int i =0; i<vetorA.length; i++) {
			vetorA[i] = cotacao * (i+1);
			
		}
		
		System.out.println("vetor A = ");
		for(int i =0; i<vetorA.length;i++) {
			System.out.println(vetorA[i] + " ");
		}
		
		System.out.println();
		
		sc.close();
	}

}
