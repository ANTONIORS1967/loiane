package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio015 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o lado1 do tri�ngulo");
		int lado1 = sc.nextInt();
		
		System.out.println("Entre com o lado2 do tri�ngulo");
		int lado2 = sc.nextInt();
		
		System.out.println("Entre com o lado3 do tri�ngulo");
		int lado3 = sc.nextInt();
		
		if(((lado1+lado2)>lado3) && ((lado1+lado3)>lado2) && ((lado2+lado3)>lado1)) {
			
			if((lado1==lado2) && (lado1==lado3) && (lado2==lado3)) {
				System.out.println("Tri�ngulo escaleno");
			}else if((lado1==lado2 )||( lado1==lado3 )|| (lado2==lado3)) {
				System.out.println("Tri�ngulo is�sceles");
			}else if((lado1!=lado2) || (lado1 !=lado3) || (lado2 !=lado3)) {
				System.out.println("Tri�ngulo equil�tero");
			}else {
				System.out.println("N�o forma um tri�ngulo");
			}
			
			
		}
		
		sc.close();
	}

}
