package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio019 {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número:");
		int num1 = sc.nextInt();
		
		System.out.println("Entre com o segundo número:");
		int num2 = sc.nextInt();
		
		System.out.println("Entre com a operação (+ - / x)");
		String operacao = sc.next();
		
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao) {
		case "+": resultado = num1+num2; break;
		case "-": resultado = num1-num2; break;
		case "/": resultado = num1/num2; break;
		case "x": resultado = num1*num2; break;
		default:
			valida=false;
		}
		
		if(valida) {
			System.out.println("Resultado " +resultado);
			 
			if(resultado >=0) {
				System.out.println("Positivo");
			}else {
				System.out.println("Negativo");
			}
			if(resultado%2==0) {
				System.out.println("par");
			}else {
				System.out.println("Impar");
			}
		}
		

		
		
		
		sc.close();
	}

}
