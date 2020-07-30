package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio022 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade (Kg) de morango");
		double qtdMorango = sc.nextDouble();
		
		System.out.println("Entre com a quantidade (Kg) de maça");
		double qtdMaca = sc.nextDouble();
		
		double precoKgMorango =0;
		if(qtdMorango<=5) {
			precoKgMorango=2.5;
		}else {
			precoKgMorango=2.20;
		}
		double precoKgMaca =0;
		if(qtdMaca<=5) {
			precoKgMaca=1.8;
		}else {
			precoKgMaca=1.50;
		}
		
		double precoTotalMorango = precoKgMorango*qtdMorango;
		double precoTotalMaca = precoKgMaca*qtdMaca;
		
		double precoParcial =precoTotalMorango+ precoTotalMaca;
		double precoTotal= precoParcial;
		
		if((qtdMorango+qtdMaca>8)||(precoParcial>25)) {
			precoTotal = precoTotal - (precoParcial/100)*10;
		}
		
		System.out.println("Preço Total a gagar " + precoTotal);
		
		sc.close();
	}

}
