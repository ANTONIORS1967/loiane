package com.antonio.curso.aula13.labs;

import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		


		System.out.println("Informe um valor em metros: ");
		int metros = sc.nextInt();
		
		int centimetros = metros*100;
		
		System.out.println( metros+ " metros equivale  a "+ centimetros +" centimetros");
		
		
		sc.close();
		
	}

}
