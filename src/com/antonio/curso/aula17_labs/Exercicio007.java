package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio007 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE;
		
		for (int i = 0; i<5;i++) {
			System.out.println("Entre com um numero:");
			num=sc.nextInt();
			
			if(num>maior) {
				maior=num;
				System.out.println("O número marior mudou " +maior);
			}
			
			
		}
		
		System.out.println("O maior número digitado foi "+maior);
		
		sc.close();
	}

}
