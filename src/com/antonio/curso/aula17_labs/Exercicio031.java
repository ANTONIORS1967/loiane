package com.antonio.curso.aula17_labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio031 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double salario = 1000; // 95
		double percentutal = 1.5; //96
		salario += (salario/100)*percentutal;
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		for(int i = 1995; i<2020;i++) {
			percentutal *= 2;
			
			salario += (salario/100)*percentutal;
			
			System.out.println(i + " = " + format.format(salario) + " - " + percentutal + "%");
		}
		
		
		
		sc.close();
	}
	
	

}
