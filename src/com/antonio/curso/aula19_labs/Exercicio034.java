package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio034 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posi��o A");
			vetorA[i] = sc.nextInt();
			
		}
		
		
		for(int i =0; i<vetorA.length;i++) {
			System.out.println("Analizando o n�mero:" + vetorA[i]);
			for(int j = 2; j<vetorA.length; j++) {
				if(j%2==0) {
					System.out.println( j + " � par " );
				}else {
					System.out.println(j + " � impar ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
