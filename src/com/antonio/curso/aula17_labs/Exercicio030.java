package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio030 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número para gerar a tabuada");
		int num =sc.nextInt();
		
		boolean invalido = false;
		int numInicio;
		int numFinal;
		
		do {
			System.out.println("Entre com o início da tabuaa:");
			numInicio = sc.nextInt();
			
			System.out.println("Entre com o fial da tabuada");
			numFinal = sc.nextInt();
			
			if(numFinal>numInicio) {
				invalido= true;
			}
			
		}while(!invalido);
		
		System.out.println("Tabuada de " + num + ":");
        System.out.println("Começar por: " + numInicio);
        System.out.println("Terminar em: " + numFinal);
        System.out.println();
        
        for(int  i = numInicio;i< numFinal;i++) {
        	 System.out.println(num + " x " + i + " = " + (num*i));
        }
		
		sc.close();
	}

}
