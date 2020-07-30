package com.antonio.curso.aula13.labs;

import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número.");
		int numero = sc.nextInt();
		System.out.println("O número digitado foi: " + numero);
		
		sc.close();

	}

}
