package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio023 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			System.out.println("Informe o tipo de carne:");
			System.out.println("1 - File Duplo ");
			System.out.println("2 - Alcatra  ");
			System.out.println("3 - Picanha  ");
			int tipo = sc.nextInt();
			
			
			System.out.println("Entre com a quantidade de KG");
			double qtdKg = sc.nextDouble();

			double precoKg = 0;
			
			if(tipo ==1) {
				System.out.println(qtdKg + "kg - file duplo");			
				if(qtdKg <5) {
					precoKg=4.9;
				}else {
					precoKg=5.8;
				}
				
			}else if(tipo ==2) {
				System.out.println(qtdKg + "kg - Alcatra ");			
				if(qtdKg <5) {
					precoKg=5.9;
				}else {
					precoKg=6.8;
				}
				
			}else if(tipo ==3) {
				System.out.println(qtdKg + "kg - Picanha  ");			
				if(qtdKg <5) {
					precoKg=.9;
				}else {
					precoKg=7.8;
				}
				
			}
		
		
			double total = qtdKg*precoKg;
			System.out.println(qtdKg + "kg * " + precoKg + " = " + total);
			
			
			System.out.println("Compre no cartão? Digite 1 para (Sim)");
			int cartao = sc.nextInt();
			
			if(cartao ==1) {
				double desconto = (total/100)*5;
				 System.out.println("Desconto de: " + desconto);
				 System.out.println("Valor a pagar: " + (total - desconto));
			}else {
				   System.out.println("Valor a pagar: " + total);
			}
			
			
			
		sc.close();
	}

}
