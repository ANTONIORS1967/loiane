package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio033 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		String msg ;
		boolean primo ;
		
		for(int i =0; i<vetorA.length;i++) {
			System.out.println("Entre como o valor da posição A: ");
			vetorA[i] = sc.nextInt();
			
			
		}
		
		for(int i = 0; i<vetorA.length;i++) {
			primo = true;
			for(int j = 2; j<vetorA[i]; j++) {
				if(vetorA[i]%j==0) {
					primo = false;
					break;
					
				}
			}
			
			msg="";
			if(primo) {
				msg = " primo ";
			}else {
				msg = " Não é primo ";
			}
			
			System.out.println(vetorA[i] + msg);
		}
				
		
		sc.close();
	}

}
