package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio026 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num = sc.nextInt();
		
		System.out.println("Fatorial de: " + num);
		
		System.out.print(num + "! = ");
		
		int fatorial=1;
		for(int i =num;i>0;i--) {
			fatorial *=i;
			System.out.print(i + ".");
		}
		System.out.println(" = " +fatorial);
		
		sc.close();
	}

}
