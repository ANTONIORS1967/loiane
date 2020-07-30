package com.antonio.curso.aula13.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do arquivo:");
		double tamanhoArquivo = sc.nextDouble();
		
		System.out.println("Entre com a velocidade da internet:");
		double velocidadeInternet = sc.nextDouble();
		
		double tempo = tamanhoArquivo/velocidadeInternet;
		
		System.out.println("Tempo de downloard " + tempo);
		
		
		sc.close();
	}

}
