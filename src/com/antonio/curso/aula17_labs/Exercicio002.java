package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean valorValido = false;
		
		do {
			
			System.out.println("Entre com o nome:");
			String nome = sc.nextLine();
			
			System.out.println("Entre com a senha :");
			String senha = sc.nextLine();
			
			if(nome.equalsIgnoreCase(senha)) {
				//valorValido = false;
				System.out.println("Senha inválida, digite novamente");
				
			}else {
				valorValido = true;
				System.out.println("Senha correta");
				
			}	
			
			
		}while(!valorValido);
		
		
		
		sc.close();
	}

}
