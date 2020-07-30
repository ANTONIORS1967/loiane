package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio016 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor de a");
		int a = sc.nextInt();
		
		if(a==0) {
			System.out.println("Nao existem raizes reais");
		}else {
			System.out.println("Entre com o valor de b");
			int b = sc.nextInt();
			
			System.out.println("Entre com o valor de c");
			int c = sc.nextInt();
			
			double delta = (b*b) - 4*a*c;
			
			if(delta<0) {
				System.out.println("Delta negativo");
			}else {
				System.out.println("Delta:" +delta);
				double x1 = -(b)+ (Math.sqrt(delta)/a); 
				double x2 = -(b)- (Math.sqrt(delta)/a); 
				
				System.out.println("x1 = " +x1);
				System.out.println("x2 = " +x2);
			}
		}
		
		sc.close();
	}

}
