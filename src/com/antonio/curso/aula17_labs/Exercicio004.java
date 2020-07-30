package com.antonio.curso.aula17_labs;

public class Exercicio004 {

	public static void main(String[] args) {

		int popA = 80000;
		int popB = 200000;
		int cont=0;
		
		while(popA<popB) {
			
			popA += (popA/100)*3;
			popA += (popB/100)*1.5;
			cont ++;
		}
		
		System.out.println("Populaçao A: " +popA);
		System.out.println("Populaçao B: " +popB);
		System.out.println("Quantidade de anos: " +cont);
		System.out.println("Aumento de A: " +(popA/100)*3);
		System.out.println("Aumento de B: " +(popB/100)*1.5);
	}

}
