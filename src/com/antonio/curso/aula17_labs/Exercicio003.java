package com.antonio.curso.aula17_labs;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String nome,estadoCivil,sexo;
		double salario;
		int idade;
		
		
		boolean infValida= false;
		do {
			
			System.out.println("Entre com o nome.");		
			nome = sc.nextLine();		
			if(nome.length()>3) {
			infValida= true;
			}else {
				System.out.println("O nome tem que ter acima de três caracteres");
			}
			
		}while(!infValida);
		
	  infValida= false;
		do {
			
			System.out.println("Entre com o idade.");		
			idade = sc.nextInt();
			
			if(idade>0 && idade<=150) {
			infValida= true;
			}else {
				System.out.println("A idade precisa esta entre 0 a 150");
			}
			
		}while(!infValida);
		
		infValida= false;
		do {
			
			System.out.println("Entre com o salario.");		
			salario = sc.nextDouble();
			if(salario>0) {
			infValida= true;
			}else {
				System.out.println("Salario precisa ser maior do que 0");
			}
			
		}while(!infValida);
		
		infValida= false;
		do {
			
			System.out.println("Entre com o sexo.");		
			sexo = sc.nextLine();
			if(sexo.equalsIgnoreCase("m") ||sexo.equalsIgnoreCase("f") ) {
			infValida= true;
			}else {
				System.out.println("Sexo diferente de 'f' e 'm':");
			}
			
		}while(!infValida);
		
		infValida= false;
		do {
			
			System.out.println("Entre com o estado civil.");		
			estadoCivil = sc.nextLine();
			if(estadoCivil.equalsIgnoreCase("s") ||estadoCivil.equalsIgnoreCase("c") ||estadoCivil.equalsIgnoreCase("v") ||estadoCivil.equalsIgnoreCase("d")) {
			infValida= true;
			}else {
				System.out.println("Estado civil diferente de  's', 'c', 'v', 'd';:");
			}
			
		}while(!infValida);
		
		
		
		
		 System.out.println("As seguintes informações foram coletadas:");
	        System.out.println("Nome: " + nome);
	        System.out.println("Idade: " + idade);
	        System.out.println("Salário: " + salario);
	        System.out.println("Sexo: " + sexo);
	        System.out.println("Estado Civil: " + estadoCivil);
	        
		sc.close();
	}

}
