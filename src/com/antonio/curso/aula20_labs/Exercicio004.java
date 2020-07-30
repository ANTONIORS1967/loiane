package com.antonio.curso.aula20_labs;

import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[][] compromissos = new String[31][24];
		
		byte opcao;
		boolean sair = false;
		while(!sair) {
			System.out.println("Digite 1 para adicionar compromisso:");
			System.out.println("Digite 2 para verificar compromisso:");
			System.out.println("Digite 0 para sair:");
			
			opcao = sc.nextByte();
			if(opcao ==1 ) {//adicionar compromisso
				
				boolean diaValido = false;
				int dia=0;
				while(!diaValido) {
					System.out.println("Entre com o dia do mês:");
					dia=sc.nextInt();
					if(dia>0 && dia<=31) {
						diaValido=true;
					}else {
						System.out.println("dia  inválida, digite novamente");
					}				
					
				}
				
				boolean horaValida = false;
				int hora = 0;
				while(!horaValida) {
					System.out.println("Entre com o hora do dia:");
					hora=sc.nextInt();
					if(hora>=0 && hora<=24) {
						horaValida=true;
					}else {
						System.out.println("hora  inválida, digite novamente");
					}				
					
				}
				
				dia --;
				System.out.println("Digite o compromisso:");
				compromissos[dia][hora] = sc.next();
				
			}else if(opcao == 2) {//verificar compromiso
				boolean diaValido = false;
				int dia=0;
				while(!diaValido) {
					System.out.println("Entre com o dia do mês:");
					dia=sc.nextInt();
					if(dia>0 && dia<=31) {
						diaValido=true;
					}else {
						System.out.println("dia  inválida, digite novamente");
					}				
					
				}
				
				boolean horaValida = false;
				int hora = 0;
				while(!horaValida) {
					System.out.println("Entre com o hora do dia:");
					hora=sc.nextInt();
					if(hora>=0 && hora<=24) {
						horaValida=true;
					}else {
						System.out.println("hora  inválida, digite novamente");
					}				
					
				}
				dia --;
				System.out.println("O compromisso agendado é:");
				System.out.println(compromissos[dia][hora]);
				
			}else if(opcao==0){
				sair = true;
			}else {
				System.out.println("opção inválida, digite novamente");
			}
			
		}
		
		
		
		sc.close();
	}

}
