package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio011 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o primeiro n�mero:");
		int num1 = sc.nextInt();

		System.out.println("Entre com o segundo n�mero:");
		int num2 = sc.nextInt();

		int soma=0;
		
		for (int i = num1; i < num2; i++) {
			soma +=i;
			
		}

		System.out.println("A soma � = " + soma);
		sc.close();
	}

}
