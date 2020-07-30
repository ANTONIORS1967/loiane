package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio024 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i =0; i<vetorA.length;i++) {
			
			System.out.println("Entre com um númeoro para a posição " +i);
			vetorA[i] = sc.nextInt();
		}
		
		//1221
		//i=0
		boolean palindromo = true;
		for(int i = 0; i<(vetorA.length/2); i++) {
			if(vetorA[i] != vetorA[vetorA.length -1 -i]) {
				palindromo = false;
				break;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		if(palindromo) {
			System.out.println("Palimdromo");
		}else {
			System.out.println("Não é palindromo");
		}
		
		sc.close();
	}

}
