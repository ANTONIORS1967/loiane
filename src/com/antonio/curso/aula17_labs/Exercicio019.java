package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe com os números de  notas");
		double notas = sc.nextDouble();
		
		double soma=0;
		double media;
		double nota;
		
		for(int i = 0; i<notas; i++) {		
			System.out.println("Entre com a nota "+ (i+1));
			nota = sc.nextDouble();
			
			soma +=nota;
		}
		
		media=soma/notas;
		
		System.out.println("Soma: " +soma);
		System.out.println("Média: " +media);
		
		sc.close();
	}

}
