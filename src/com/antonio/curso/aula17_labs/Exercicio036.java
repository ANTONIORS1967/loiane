package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio036 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de n:");
        int n = sc.nextInt();
        
        double soma = 0;
        
        for (int i=1; i<=n; i++){
            
            soma += 1/i;
        }
        
        System.out.println("Soma = " + soma);
        
        sc.close();
	}

}
