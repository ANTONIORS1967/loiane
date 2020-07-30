package com.antonio.curso.aula13.labs;

import java.util.Scanner;

public class Exercicio010 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é a temperatura em  Celsius?");
		double c = sc.nextDouble();
		
		double F =  1.8 * c + 32;
		
		System.out.println("A temperatura em Celsius é "+F+"º");
		

		
		
		sc.close();
	}

}
