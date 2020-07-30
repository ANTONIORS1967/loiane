package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio017 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int[] idades = new int[10];
		
		for(int i=0; i<idades.length;i++) {
			System.out.println("Entre com o valor da posição " +i);
			idades[i] = sc.nextInt();
		}
		
		
		int qtd = 0;
		
		for(int i = 0; i<idades.length; i++) {
			if(idades[i]> 35) {
				qtd++;
				
			}
		}	
			
		
		System.out.print("Vetor A = ");
		for(int i=0; i<idades.length;i++) {
			System.out.print(idades[i] + " ");
		}
		System.out.println();
		
		
		
		System.out.println("Quantidade de pessoas maires de 35 anos  = " +qtd);
		
			sc.close();
	}

}
