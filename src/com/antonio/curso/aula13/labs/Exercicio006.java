package com.antonio.curso.aula13.labs;

import java.util.Scanner;

public class Exercicio006 {

	public static void main(String[] args) {


		Scanner sc=  new Scanner(System.in);
		
		System.out.println("Informe o raio da circunferência");
		int raio = sc.nextInt();
		
		double areaCircunferencia = Math.PI * raio * raio;
		
		System.out.printf("A área de uma circunferência de raio " + raio +" = é igual a " + areaCircunferencia );
		
		sc.close();

	}

}
