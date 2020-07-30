package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio008 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		

		System.out.println("Informe o preço do produto1 ");
		double produto1 = sc.nextDouble();
		
		System.out.println("Informe o preço do produto2 ");
		double produto2 = sc.nextDouble();
		
		System.out.println("Informe o preço do produto3 ");
		double produto3 = sc.nextDouble();

		if (produto1 <= produto2 && produto1 <= produto3) {
			System.out.println("O melhor preço é  " +produto1);
		} else if (produto2 <= produto1 && produto2 <= produto3) {
			System.out.println("O melhor preço é  " +produto2);
		} else if (produto3 <= produto1 && produto3 <= produto2) {
			System.out.println("O melhor preço é  " +produto3);
		}
		
		sc.close();
	}

}
