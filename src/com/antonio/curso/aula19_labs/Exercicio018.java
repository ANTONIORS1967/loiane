package com.antonio.curso.aula19_labs;

import java.util.Scanner;

public class Exercicio018 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		
		int[] idades = new int[10];
		
		for(int i=0; i<idades.length;i++) {
			System.out.println("Entre com a idade das pessoa " +(i+1));
			idades[i] = sc.nextInt();
		}
		
		
		int maior = idades[0];
		int indexMaior=0;
		int menor = idades[0];
		int indexMenor=0;
		
		for(int i = 0; i<idades.length; i++) {
			if(idades[i]> maior) {
				maior = idades[i];
				indexMaior = i;
				
			} if(idades[i]< menor) {
				menor = idades[i];
				indexMenor = i;
			}
			
		}	
			
		
		System.out.print("Idades   = ");
		for(int i=0; i<idades.length;i++) {
			System.out.print(idades[i] + " ");
		}
		System.out.println();
		
		
		
		System.out.println("Menor idade: " + menor);
        System.out.println("Índice menor idade: " + indexMenor);
        System.out.println("Maior idade: " + maior);
        System.out.println("Índice menor idade: " + indexMaior);
        
			sc.close();
	}

}
