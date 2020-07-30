package com.antonio.curso.aula24_labs;

public class Exercicio01 {

	public static void main(String[] args) {

		Lampada lampada =new Lampada();
		
		lampada.codigoFornecedor = 103040;
		lampada.comprimento = 3.9;
		lampada.diametro = 0.9;
		lampada.linha = "Iluminação";
		lampada.marca = "Ourolux";
		lampada.modelo = "Bulbo";
		lampada.potencia = 80;
		lampada.soquete = "E27";
		lampada.temperaturaCor = "2800K";
		lampada.tencao = 89;
		
		
		System.out.println(lampada.codigoFornecedor);
		System.out.println(lampada.diametro);
		System.out.println(lampada.modelo);
		System.out.println(lampada.temperaturaCor);
	}

}
