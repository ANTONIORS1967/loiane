package com.antonio.curso.aula13.labs;

import java.util.Scanner;

public class Exercicio006 {

	public static void main(String[] args) {


		Scanner sc=  new Scanner(System.in);
		
		System.out.println("Informe o raio da circunfer�ncia");
		int raio = sc.nextInt();
		
		double areaCircunferencia = Math.PI * raio * raio;
		
		System.out.printf("A �rea de uma circunfer�ncia de raio " + raio +" = � igual a " + areaCircunferencia );
		
		sc.close();

	}

}
