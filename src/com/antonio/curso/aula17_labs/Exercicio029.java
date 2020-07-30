package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio029 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número:");
		int num = sc.nextInt();
		
		boolean primo ;
		
		for(int i =2; i<=num; i++) {
			
			primo = true;
			
			for(int j=2; j<i; j++) {
				if(i%j ==0) {
					primo=false;
				}
			}
			if(primo) {
				System.out.println(i);
		}
		
		}
		
		sc.close();
	}
	
}
