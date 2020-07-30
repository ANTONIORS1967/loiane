package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com uma letra 'F' ou 'M'");
		String letra = sc.next();
		
		if(letra.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		}else if(letra.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		}else {
			System.out.println("Letra inválida");
		}
		
		
		
		sc.close();
	}

}
