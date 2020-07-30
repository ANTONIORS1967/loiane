package com.antonio.curso.aula13.labs;

import java.util.Scanner;

public class Exercicio008 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quanto você gannha por hora?");
		double ganhoPorHora = sc.nextDouble();
		
		System.out.println("Quantas horas você trabalhou?");
		double horasTrabalhadas = sc.nextDouble();
		
		double salario = ganhoPorHora*horasTrabalhadas;
		
	System.out.println("Seu salário é: " +salario);
		
		
		
		
		
		sc.close();
		
	}

}
