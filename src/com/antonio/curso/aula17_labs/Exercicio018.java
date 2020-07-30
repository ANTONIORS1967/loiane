package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio018 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número:");
		int num = sc.nextInt();
		
		
		
		for(int i =2; i<=num;i++) {
			if(i%2==0) {
				System.out.println(" O número " +i +" não é primo");
			
			}else {
				System.out.println(" O número " +i +" é primo");
			}
		}
		
		
		
		
		sc.close();
	}

}
