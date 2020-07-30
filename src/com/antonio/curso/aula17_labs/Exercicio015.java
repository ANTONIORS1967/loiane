package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio015 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o enesico termo de Fibonach");
		int n = sc.nextInt();
		
		int primeiro =1;
		int segundo = 1;
		int proximo;
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for(int i = 3;i<n;i++) {
			
			
			proximo = primeiro+segundo;
			primeiro = segundo;
			segundo= proximo;
			
			System.out.println(proximo);
		}
		sc.close();
	}

}
