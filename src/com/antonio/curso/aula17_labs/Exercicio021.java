package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero de turamas");
		int numTurmas = sc.nextInt();
		
		boolean invalido = true;
		int numAlunos;
		double soma=0;
		double media;
		
		
		for(int i = 0; i<numTurmas;i++) {
			
			invalido = true;
			
			do {
				System.out.println("Entre com o n�mero de aluno da turma:" + (i+1));
				numAlunos = sc.nextInt();
				if(numAlunos<=40) {
					invalido = false;
				}else {
					System.out.println("N�mero de alunos inv�lidos, digite novamente");
				}
				
				
				
			}while(invalido);
			soma +=numAlunos;
		}
		
		media = soma/numTurmas;
		
		System.out.println("M�dia: " +media);
		sc.close();
	}

}
