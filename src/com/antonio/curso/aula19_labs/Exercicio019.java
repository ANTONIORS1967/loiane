package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double[] nota1 = new double[10];
		double[] nota2 = new double[nota1.length];
		double[] resultado = new double[nota1.length];
		
		
		for(int i = 0; i<nota1.length; i++) {
			
			System.out.println("Entre com a nota 1 do aluno" +(i+1));
			nota1[i] = sc.nextDouble();
			
			System.out.println("Entre com a nota 2 do aluno" +(i+1));
			nota2[i] = sc.nextDouble();
			
			resultado[i] = (nota1[i]+nota2[i])/2;
				
			
		}
		
		System.out.print("Nota1 = ");
		for(int i = 0;i<nota1.length; i++) {
			System.out.print( nota1[i] +" ");
		}
		System.out.println();
		
		System.out.print("Nota2 = ");
		for(int i = 0;i<nota1.length; i++) {
			System.out.print( nota2[i] +" ");
		}
		System.out.println();
		
		
		System.out.println("Resultado: ");
		for(int i =0; i<nota1.length; i++) {
			if(resultado[i]>=7) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");
			}
		}
		
		
		sc.close();
	}

}
