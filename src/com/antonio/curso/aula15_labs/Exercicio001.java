package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um n�mero:");
		int num1 = sc.nextInt();
		
		System.out.println("Informe outro n�mero:");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("Este � o maior: "+ num1);
		}else {
			System.out.println("Este � o maior: "+ num2);
		}
		
		
		
		
		sc.close();
	}

}
