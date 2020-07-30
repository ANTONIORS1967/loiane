package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um númro para gerar a tabuada:");
		int num = sc.nextInt();
		
		System.out.println("Tabuada de "+ num + ":");
		for(int  i = 0; i<=10; i++) {
			
			System.out.println(num + " X " + i + " = " + i*num );
			
			
		}
		
		sc.close();
	}

}
