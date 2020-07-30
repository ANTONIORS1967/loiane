package com.antonio.curso.aula13.labs;

import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Informe a primeira nota");
		double nota1 = sc.nextDouble();
		
		System.out.println("Informe a segunda nota");
		double nota2 = sc.nextDouble();
		
		System.out.println("Informe a terceira  6nota");
		double nota3 = sc.nextDouble();
		
		System.out.println("Informe a quarta nota");
		double nota4  = sc.nextDouble();
		
		
		 double media  = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("A média é " + media);
		
		
		sc.close();
		
	}

}
