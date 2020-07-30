package com.antonio.curso.aula17_labs;

import java.util.Scanner;

public class Exercicio025 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean sair= false;
		String continuarCompra;
		String autput;
		int qtdProdutos;
		double total;
		double preco;
		double valorPago;
		double troco;
		
		do {
			System.out.println("Deseja informar uma nova compra (S/N)");
			continuarCompra=sc.next();
			
			if(continuarCompra.equalsIgnoreCase("s")) {
				autput = "Lojas Tabajara ";
				
				System.out.println("Digite a quantidade de produto da compra:");
				qtdProdutos = sc.nextInt();
				
				total =0;
				
				for(int i =1;i<qtdProdutos;i++) {
					System.out.println("Informe o preço do produto" +i);
					preco =  sc.nextDouble();
					total +=preco;
					autput = "Produto " +i+ ": R$ " +preco+ "\n" ;
					
				}
				
				autput += " Total: R$ " +  total+ "\n";
				System.out.println("Total: R$" + total);
				
				System.out.println("Entre com o valor paga ");
				valorPago = sc.nextDouble();
				
				autput = "Dinheiro: R$ " + valorPago + " \n" ;
				
				troco = total-valorPago;
				
				autput = "Troco: R$ " + troco +"\n";
				
				System.out.println(autput);
				
				
			}else {
				sair = true;
			}
			
		}while(!sair);
		
		
		sc.close();
	}

}
