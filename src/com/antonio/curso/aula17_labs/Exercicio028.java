package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio028 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o n�mero:");
		int num = sc.nextInt();

		boolean primo = true;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("N�o � primo - divis�vel por " +i);
				primo = false;
				break;
			}
		}
		if(primo) {
			System.out.println("� n�mero primo:");
		}

		sc.close();
	}

}
