package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio034 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	
        
        System.out.println("Digite o valor de n:");
        double n = sc.nextDouble();
        
        double soma = 0;
        
        for (int i=1; i<=n; i++){
            
            soma += 1/i;
        }
        
        System.out.println("Soma = " + soma);
		
		
		sc.close();
	}

}
