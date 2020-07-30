package com.antonio.curso.aula24;

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
		
		Carro fusca = new Carro();
		fusca.marca = "Woskvargen";
		fusca.modelo = "Fusca";
		fusca.numPassaageiros = 10;
		fusca.capCombustivel = 100;
		fusca.consumoCombustivel = 0.2;
		
		System.out.println(fusca.modelo);
		System.out.println(fusca.marca);
	}

}
