package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio013 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com uma op��o de dia (1 - 7) ");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1: System.out.println("Domingo");break;
		case 2: System.out.println("Segunda");break;
		case 3: System.out.println("Ter�a");break;
		case 4: System.out.println("Quarta");break;
		case 5: System.out.println("Quinta");break;
		case 6: System.out.println("Sexta");break;
		case 7: System.out.println("S�bado");break;
		
		default: System.out.println("Op�ao inv�lida");
		
		}
		
		
		sc.close();
	}

}
