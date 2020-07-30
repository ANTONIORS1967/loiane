package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio010 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número:");
		int num1 = sc.nextInt();
		
		System.out.println("Entre com o segundo número:");
		int num2 = sc.nextInt();
		
		
		for(int i = num1; i< num2; i++) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
