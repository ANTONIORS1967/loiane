package com.antonio.curso.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Informe um numero inteiro:");
		int num1 = sc.nextInt();
		
		System.out.println("Informe outro número inteiro:");
		int num2 = sc.nextInt();
		
		System.out.println("Informe um numero real:");
		double real = sc.nextDouble();
		
		double produto = (num1*2)*(num2/2);
		double soma = (num1*3) + real;
		double potencia = Math.pow(real, 3);
		
		System.out.println("o produto do dobro do primeiro com metade do segundo é " +produto);
		System.out.println("a soma do triplo do primeiro com o terceiro é "+ soma);
		System.out.println("o terceiro elevado ao cubo é "+potencia);
		
		
		sc.close();
	}

}
