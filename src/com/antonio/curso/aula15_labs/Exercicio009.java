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
			//num1 � menor
			//num3 � maior
			//num1<num2<num3			
			System.out.println(num1 + " - " + num2 + " - " + num3);
			
		}else if(num1<=num2&&num1<=num3&&num3<=num2) {
			//num1 � menor
			//num2 � maior
			//num1<num3<num2		
			System.out.println(num1 + " - " + num3 + " - " + num2);
			
		}else if(num2<=num1&&num2<=num3&&num1<=num3) {
			//num2 � menor
			//num3 � maior
			//num2<num1<num3		
			System.out.println(num2 + " - " + num1 + " - " + num3);
		}else if(num2<=num1&&num2<=num3&&num3<=num1) {
			//num2 � menor
			//num1 � maior
			//num2<num3<num1			
			System.out.println(num2 + " - " + num3 + " - " + num1);
			
		}else if(num3<=num1&&num3<=num2&&num1<=num2) {
			//num3 � menor
			//num2 � maior
			//num3<num1<num2		
			System.out.println(num3 + " - " + num1 + " - " + num2);
			
		}else if(num3<=num1&&num3<=num2&&num2<=num1) {
			//num3 � menor
			//num1 � maior
			//num3<num2<num1		
			System.out.println(num3 + " - " + num2 + " - " + num1);
		}
		sc.close();
	}

}
