package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio027 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de temperatura:");
		double qtdTemperatura = sc.nextDouble();
		
		double temp;
		double soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		for(int i = 0; i<qtdTemperatura; i++) {
			System.out.println("entre com a temperatura: " +i);
			temp = sc.nextInt();
			soma +=temp;
			
			if(temp >maior) {
				maior = temp;
			}
			if(temp<menor) {
				menor = temp;	
			}
		}
		
		System.out.println("Média: " + (soma/qtdTemperatura));
		System.out.println("Maior: " +maior);
		System.out.println("Menor: " +menor);
		
		sc.close();
		
		
	}

}
