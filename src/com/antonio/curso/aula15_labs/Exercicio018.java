package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio018 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro");
		int numero =sc.nextInt();
		
		if(numero%2==0) {
			System.out.println("O número " +numero+ " é par " );
		}else {
			System.out.println("O número " +numero+ " é impar ");
		}
		
		
		
		sc.close();
	}

}
