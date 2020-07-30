package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a quantidade de litros vendidos");
		double litros = sc.nextDouble();

		System.out.println("Ente com o tipo de combustível");
		String tipo = sc.next();

		double precoGasolina = 2.50;
		double precoAlcool = 1.90;
		int percDesconto = 0;
		double total = 0;
		double totalDesconto = 0;

		if (tipo.equalsIgnoreCase("a")) {
			if (litros <= 20) {
				percDesconto = 3;
			} else {
				percDesconto = 5;
			}
			total = litros * precoAlcool;
		} else if (tipo.equalsIgnoreCase("g")) {
			if (litros <= 20) {
				percDesconto = 4;
			} else {
				percDesconto = 6;
			}
			total = litros * precoGasolina;
		}
		
		
		totalDesconto=(total/100)*percDesconto;
		double precoAPagar = total-totalDesconto;
		
		System.out.println("Preço a pagar "+precoAPagar);
		

		sc.close();
	}

}
