package com.antonio.curso.aula20_labs;

import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[][][] compromissos = new String[12][31][24];

		byte opcao;
		boolean sair = false;
		while (!sair) {
			System.out.println("Digite 1 para adicionar compromisso:");
			System.out.println("Digite 2 para verificar compromisso:");
			System.out.println("Digite 0 para sair:");

			opcao = sc.nextByte();
			if (opcao == 1) {// adicionar compromisso

				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.println("Entre com o mes do ano:");
					mes = sc.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("mes  inválida, digite novamente");
					}

				}

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês:");
					dia = sc.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("dia  inválida, digite novamente");
					}

				}

				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com o hora do dia:");
					hora = sc.nextInt();
					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("hora  inválida, digite novamente");
					}

				}
				mes--;
				dia--;
				System.out.println("Digite o compromisso:");
				compromissos[mes][dia][hora] = sc.next();

			} else if (opcao == 2) {// verificar compromiso
				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.println("Entre com o mes do ano:");
					mes = sc.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("mes  inválida, digite novamente");
					}

				}
				
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês:");
					dia = sc.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("dia  inválida, digite novamente");
					}

				}

				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com o hora do dia:");
					hora = sc.nextInt();
					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("hora  inválida, digite novamente");
					}

				}
				mes--;
				dia--;
				System.out.println("O compromisso agendado é:");
				System.out.println(compromissos[mes][dia][hora]);

			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("opção inválida, digite novamente");
			}

		}

		sc.close();
	}

}
