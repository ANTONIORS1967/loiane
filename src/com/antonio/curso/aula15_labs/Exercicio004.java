package com.antonio.curso.aula15_labs;

import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com uma letra:");
		String letra = sc.next();
		
		if(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||
				letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("i")||
				letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")) {
			System.out.println("Vogal");
		}else {
			System.out.println("Consoante");
		}
		/*
		if(letra.length()>1){
			System.out.println("Não é uma letra");
		}else {
			switch(letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":System.out.println("votal");break;
		
			default: System.out.println("consoante");break;
			}
			
		
		}
		
		*/
		sc.close();
	}

}
