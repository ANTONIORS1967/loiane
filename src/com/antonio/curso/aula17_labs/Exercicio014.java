package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio014 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//System.out.println("");
		int pares=0;
		int impares=0;
		
		int num;
		
		for(int i=1;i<10;i++) {
			System.out.println("Entre com um número");
			num = sc.nextInt();
			if(num%2==0) {
				pares++;
			}else {
				impares++;
			}
			
		}
		System.out.println("Pares = " +pares);
		System.out.println("Impares = " +impares);
		
		sc.close();
	}

}
