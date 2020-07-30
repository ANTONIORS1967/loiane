package com.antonio.curso.aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numPassaageiros;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("Autonomia do " + capCombustivel* consumoCombustivel+ " km" ); 
	}
}
