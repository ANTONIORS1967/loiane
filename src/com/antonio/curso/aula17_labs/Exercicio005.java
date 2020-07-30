package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double popA ;
		double popB;
		double taxaA;
		double taxaB;
		
		boolean valido = false;
		
		do {
			
			System.out.println("Entre com a popula��o A");
			popA = sc.nextDouble();
			
			if(popA>0) {
				valido=true;
			}else {
				System.out.println("Popula��o A precisa ser maior do que 0");
			}
		}while(!valido);
		
		valido = false;
		do {	
			System.out.println("Entre com a popula��o B");
			popB = sc.nextDouble();
			
			if(popB>0) {
				valido=true;
			}else {
				System.out.println("Popula��o B precisa ser maior do que 0");
			}
		}while(!valido);
		
		valido = false;
		do {	
			System.out.println("Entre com a taxa da pupula��o A");
			taxaA = sc.nextDouble();
			
			if(taxaA>0) {
				valido=true;
			}else {
				System.out.println("A Taxa da popula��o  A precisa ser maior do que 0");
			}
		}while(!valido);
		
		valido = false;
		do {	
			System.out.println("Entre com a taxa da pupula��o B");
			taxaB = sc.nextDouble();
			
			if(taxaB>0) {
				valido=true;
			}else {
				System.out.println("A Taxa da popula��o  B precisa ser maior do que 0");
			}
		}while(!valido);
		
		
		
		int cont=0;
		
		while(popA<popB) {
			
			popA += (popA/100)*3;
			popA += (popB/100)*1.5;
			cont ++;
		}
		
		System.out.println("Popula�ao A: " +popA);
		System.out.println("Popula�ao B: " +popB);
		System.out.println("Quantidade de anos: " +cont);
		System.out.println(" A taxa da pupula��o A: " +(popA/100)*3);
		System.out.println("A taxa da pupula��o B: " +(popB/100)*1.5);
		
		
		sc.close();
	}

}
