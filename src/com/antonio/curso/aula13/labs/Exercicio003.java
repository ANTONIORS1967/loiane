package com.antonio.curso.aula13.labs;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite num1 n�mero: ");
		int num1 = sc.nextInt();
		System.out.println("Digite num2 n�mero: ");
		int num2 = sc.nextInt();
		
		int soma = num1 +num2;
		
		System.out.println("A soma de num1 e num2 �: " +soma);
		
		
		
		sc.close();

	}

}
