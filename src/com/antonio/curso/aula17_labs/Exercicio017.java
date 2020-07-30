package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio017 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o fatorial:");
		int n = sc.nextInt();
		
		System.out.println(n +"!");
		
		double fatorial = 1;
		for(int i = n; i>0; i--) {
			fatorial *=i;
			System.out.println(i);
		}
		System.out.println(fatorial);
		sc.close();
	}

}
