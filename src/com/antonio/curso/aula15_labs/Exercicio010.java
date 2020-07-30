package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio010 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é seu turno?");
		String turno = sc.next();
		
		switch(turno) {
		case "m": 
		case "M": System.out.println("Bom dia!"); break;
		case "v": 
		case "V": System.out.println("Boa tarde!"); break;
		case "n": 
		case "N": System.out.println("Boa noite!"); break;
		default: System.out.println("Valor inválido!");
		}
		
		
		sc.close();
	}

}
