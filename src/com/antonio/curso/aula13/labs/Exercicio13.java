package com.antonio.curso.aula13.labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quanto voc� gannha por hora?");
		double ganhoPorHora = sc.nextDouble();
		
		System.out.println("Quantas horas voc� trabalhou?");
		double horasTrabalhadas = sc.nextDouble();
		
		double salarioBruto = ganhoPorHora*horasTrabalhadas;
		
		double IR = (salarioBruto/100)*11;
		double INSS = (salarioBruto/100)*8;
		double sindicato = (salarioBruto/100)*5;
		double salarioLiquido = salarioBruto-(IR+INSS+sindicato);
		
		
		System.out.println("Sal�rio bruto �: " +salarioBruto);
		System.out.println("quanto pagou ao IR?  " +IR);
		System.out.println("quanto pagou ao INSS?  " +INSS);
		System.out.println("quanto pagou ao sindicato. " +sindicato);
		System.out.println("o sal�rio l�quido. " +salarioLiquido);
		
		
		
		
		
		sc.close();

	}

}
