package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio022 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de CDs");
		int qtdCd = sc.nextInt();
		
		double valor;
		double soma = 0;
		
		for(int i=0; i<qtdCd; i++) {
			System.out.println("Informe o valor do CD");
			valor = sc.nextDouble();
			
			soma += valor;
			
		}
		
		double media = soma/qtdCd;
		System.out.println("Média gasta com Cds " + media);
		
		sc.close();
	}

}
