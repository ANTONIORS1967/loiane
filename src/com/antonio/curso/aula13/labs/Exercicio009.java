package com.antonio.curso.aula13.labs;

import java.util.Scanner;

public class Exercicio009 {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é a temperatura em  Farenheit?");
		double f = sc.nextDouble();
		
		double Celsius =  (5 * (f-32) / 9);
		
		System.out.println("A temperatura em Celsius é "+Celsius+"º");
		
		
		sc.close();
	}

}
