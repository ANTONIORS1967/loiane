package com.antonio.curso.aula25;


public class TesteCarro {

	public static void main(String[] args) {

		Carro van= new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassaageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.modelo);
		System.out.println(van.marca);
		
		
		
		van.exibirAutonomia();
	}

}
