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
			
			System.out.println("Entre com a população A");
			popA = sc.nextDouble();
			
			if(popA>0) {
				valido=true;
			}else {
				System.out.println("População A precisa ser maior do que 0");
			}
		}while(!valido);
		
		valido = false;
		do {	
			System.out.println("Entre com a população B");
			popB = sc.nextDouble();
			
			if(popB>0) {
				valido=true;
			}else {
				System.out.println("População B precisa ser maior do que 0");
			}
		}while(!valido);
		
		valido = false;
		do {	
			System.out.println("Entre com a taxa da pupulação A");
			taxaA = sc.nextDouble();
			
			if(taxaA>0) {
				valido=true;
			}else {
				System.out.println("A Taxa da população  A precisa ser maior do que 0");
			}
		}while(!valido);
		
		valido = false;
		do {	
			System.out.println("Entre com a taxa da pupulação B");
			taxaB = sc.nextDouble();
			
			if(taxaB>0) {
				valido=true;
			}else {
				System.out.println("A Taxa da população  B precisa ser maior do que 0");
			}
		}while(!valido);
		
		
		
		int cont=0;
		
		while(popA<popB) {
			
			popA += (popA/100)*3;
			popA += (popB/100)*1.5;
			cont ++;
		}
		
		System.out.println("Populaçao A: " +popA);
		System.out.println("Populaçao B: " +popB);
		System.out.println("Quantidade de anos: " +cont);
		System.out.println(" A taxa da pupulação A: " +(popA/100)*3);
		System.out.println("A taxa da pupulação B: " +(popB/100)*1.5);
		
		
		sc.close();
	}

}
