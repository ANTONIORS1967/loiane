package com.antonio.curso.aula13.labs;

import java.util.Scanner;

public class Exercicio008 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quanto voc� gannha por hora?");
		double ganhoPorHora = sc.nextDouble();
		
		System.out.println("Quantas horas voc� trabalhou?");
		double horasTrabalhadas = sc.nextDouble();
		
		double salario = ganhoPorHora*horasTrabalhadas;
		
	System.out.println("Seu sal�rio �: " +salario);
		
		
		
		
		
		sc.close();
		
	}

}
