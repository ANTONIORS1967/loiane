package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio015 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o lado1 do triângulo");
		int lado1 = sc.nextInt();
		
		System.out.println("Entre com o lado2 do triângulo");
		int lado2 = sc.nextInt();
		
		System.out.println("Entre com o lado3 do triângulo");
		int lado3 = sc.nextInt();
		
		if(((lado1+lado2)>lado3) && ((lado1+lado3)>lado2) && ((lado2+lado3)>lado1)) {
			
			if((lado1==lado2) && (lado1==lado3) && (lado2==lado3)) {
				System.out.println("Triângulo escaleno");
			}else if((lado1==lado2 )||( lado1==lado3 )|| (lado2==lado3)) {
				System.out.println("Triângulo isósceles");
			}else if((lado1!=lado2) || (lado1 !=lado3) || (lado2 !=lado3)) {
				System.out.println("Triângulo equilátero");
			}else {
				System.out.println("Não forma um triângulo");
			}
			
			
		}
		
		sc.close();
	}

}
