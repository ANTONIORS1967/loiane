package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio020 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com quantidades de idades ");
		double idades = sc.nextDouble();
		
		int idade;
		double soma =0;
		double media;
		
		for(int i = 0; i<idades; i++) {
			
			System.out.println("Entre com a idade " +(i+1));
			idade= sc.nextInt();
			soma +=idade;			
			
		}
		
		media = soma/idades;
		
		System.out.println("Media de idades:" + media );
		
		if(media >0 && media<=25) {
			System.out.println(" jovem");
		}else if(media >26 && media<=60) {
			System.out.println(" adulta");
		}else {
			System.out.println(" idosa");
		}
		
		sc.close();
	}

}
