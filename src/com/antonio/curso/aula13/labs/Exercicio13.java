package com.antonio.curso.aula13.labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quanto você gannha por hora?");
		double ganhoPorHora = sc.nextDouble();
		
		System.out.println("Quantas horas você trabalhou?");
		double horasTrabalhadas = sc.nextDouble();
		
		double salarioBruto = ganhoPorHora*horasTrabalhadas;
		
		double IR = (salarioBruto/100)*11;
		double INSS = (salarioBruto/100)*8;
		double sindicato = (salarioBruto/100)*5;
		double salarioLiquido = salarioBruto-(IR+INSS+sindicato);
		
		
		System.out.println("Salário bruto é: " +salarioBruto);
		System.out.println("quanto pagou ao IR?  " +IR);
		System.out.println("quanto pagou ao INSS?  " +INSS);
		System.out.println("quanto pagou ao sindicato. " +sindicato);
		System.out.println("o salário líquido. " +salarioLiquido);
		
		
		
		
		
		sc.close();

	}

}
