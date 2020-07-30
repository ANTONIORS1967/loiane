package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número:");
		int num1 = sc.nextInt();
		
		
		if(num1>=0) {
			System.out.println("Este é positivo: ");
		}else {
			System.out.println("Este é negativo: ");
		}
		
		
		
		
		sc.close();
	}

}
