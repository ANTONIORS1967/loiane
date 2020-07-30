package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio008 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int media;
		int num;
		int soma=0;
		
		for(int i =0; i<5;i++) {
			System.out.println("Entre com um número:");
			num = sc.nextInt();
			
			soma += num;
			
		}
		media = soma/5;
		System.out.println("Soma = " +soma);
		System.out.println("Média = " +media);
		
		sc.close();
	}

}
