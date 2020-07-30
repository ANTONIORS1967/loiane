package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor da hora:");
		double valorHora = sc.nextDouble();
		
		System.out.println("Quantas horas trabalhadas?");
		double horasTrabalhadas = sc.nextDouble();
		
		double salarioBruto = valorHora*horasTrabalhadas;
		
		double percentagemIR = 0;
		if(salarioBruto<=900) {
			percentagemIR=0;
		}else if(salarioBruto>900&&salarioBruto<=1500) {
			percentagemIR=5;
		}else if(salarioBruto>1500&&salarioBruto<=2500) {
			percentagemIR=10;
		}else if(salarioBruto>2500) {
			percentagemIR=20;
		}
		
		double ir = (salarioBruto/100)*percentagemIR;
		double sindicato = (salarioBruto/100)*3;
		double inss = (salarioBruto/100)*10;
		double fgts = (salarioBruto/100)*11;
		double totalDesconto = sindicato+ir+fgts;
		double salarioLiquido = salarioBruto-totalDesconto;
		
		System.out.println("Salário Bruto: (" + horasTrabalhadas+ "*" +valorHora + ") : " + salarioBruto);
		 System.out.println("(-) IR (" + percentagemIR + "%): " + ir);
		 System.out.println("(-) INSS ( 10%): " + inss);
		 System.out.println("(-) FGTS ( 11%): " + fgts);
		 System.out.println("(-) Sindicato ( 3%): " + sindicato);
		 System.out.println("Total de desconto: " +totalDesconto);
		 System.out.println("Saláro líquido: " +salarioLiquido);
		 
		
		
		sc.close();
	}

}
