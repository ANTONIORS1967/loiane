package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio014 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a primeita nota do aluno:");
		int nota1 = sc.nextInt();
		
		System.out.println("Entre com a segunda nota do aluno:");
		int nota2 = sc.nextInt();
		
		double media = (nota1+nota2)/2;
		
		String aproveitamento = " ";
		
		if(media>9&&media<=10) {
			aproveitamento = "A";
		}else if(media>7.5&&media<=9) {
			aproveitamento = "B";
		}else if(media>6&&media<=7.5) {
			aproveitamento = "C";
		}else if(media>4&&media<=6) {
			aproveitamento = "D";
		}else if(media<=4) {
			aproveitamento = "E";
		}
		
		System.out.println("Nota1 " +nota1);
		System.out.println("Nota2 " +nota2);
		System.out.println("Media " +media);
		System.out.println("Conceito " +aproveitamento);
		
		
		switch(aproveitamento) {
		case "A":
		case "B":
		case "C":System.out.println("Aprovado");break;
		case "D":
		case "E":System.out.println("Reprovado");break;
		
		}
		
		sc.close();
	}

}
