package com.antonio.curso.aula20_labs;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] numero = new int[3][3];
		
		
		for(int i =0; i<numero.length;i++) {
			for(int j = 0; j<numero[i].length; j++) {
				System.out.print("Entre com o valor da posição " +i + " , "+ j);
				System.out.println();
				numero[i][j] =sc.nextInt();
			
			}
		}
		
		for(int i =0; i<numero.length;i++) {
			for(int j = 0; j<numero[i].length; j++) {
				System.out.print(numero[i][j] + " | ");
			}
			System.out.println();
		}
		
		int numeroPar=0;
		int numeroImpar=0;
		for(int i =0; i<numero.length;i++) {
			for(int j = 0; j<numero[i].length; j++) {
				if(numero[i][j]%2==0) {
					numeroPar++;
				}else {
					numeroImpar++;
				}
			}
		}
		System.out.println();
		System.out.println("Números pares = "+numeroPar);
		System.out.println("Números impares = "+numeroImpar);
		
		sc.close();
	}

}
