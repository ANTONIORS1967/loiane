package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio009 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Informe num1 ");
		int num1 = sc.nextInt();

		System.out.println("Informe num2 ");
		int num2 = sc.nextInt();

		System.out.println("Informe num3 ");
		int num3 = sc.nextInt();

		if(num1<=num2&&num1<=num3&&num2<=num3) {
			//num1 é menor
			//num3 é maior
			//num1<num2<num3			
			System.out.println(num1 + " - " + num2 + " - " + num3);
			
		}else if(num1<=num2&&num1<=num3&&num3<=num2) {
			//num1 é menor
			//num2 é maior
			//num1<num3<num2		
			System.out.println(num1 + " - " + num3 + " - " + num2);
			
		}else if(num2<=num1&&num2<=num3&&num1<=num3) {
			//num2 é menor
			//num3 é maior
			//num2<num1<num3		
			System.out.println(num2 + " - " + num1 + " - " + num3);
		}else if(num2<=num1&&num2<=num3&&num3<=num1) {
			//num2 é menor
			//num1 é maior
			//num2<num3<num1			
			System.out.println(num2 + " - " + num3 + " - " + num1);
			
		}else if(num3<=num1&&num3<=num2&&num1<=num2) {
			//num3 é menor
			//num2 é maior
			//num3<num1<num2		
			System.out.println(num3 + " - " + num1 + " - " + num2);
			
		}else if(num3<=num1&&num3<=num2&&num2<=num1) {
			//num3 é menor
			//num1 é maior
			//num3<num2<num1		
			System.out.println(num3 + " - " + num2 + " - " + num1);
		}
		sc.close();
	}

}
