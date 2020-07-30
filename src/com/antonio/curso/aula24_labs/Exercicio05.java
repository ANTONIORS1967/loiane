package com.antonio.curso.aula24_labs;

public class Exercicio05 {

	public static void main(String[] args) {

		ContaCorrente conta =new ContaCorrente();
		
		conta.limite = 1000;
		conta.numero = 1345;
		conta.saldo = 5000;
		conta.status = "Aberta";
		conta.dono = "Antonio Rodrigues";
		conta.especial = false;
		
		System.out.println(" Saldo da conta: R$ " + conta.saldo);
	}

}
