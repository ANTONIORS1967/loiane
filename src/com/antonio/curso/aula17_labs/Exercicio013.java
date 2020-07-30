package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio013 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a base");
		int base = sc.nextInt();
		
		System.out.println("Entre com a expoente");
		int expoente = sc.nextInt();
		
		double resultado = base;
		
		for(int i=1; i<expoente;i++) {
			resultado *= base;
		}
		
		System.out.println("Resultado = "+resultado);
		sc.close();
	}

}
