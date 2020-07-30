package com.antonio.curso.aula20;

public class Matrizes {

	public static void main(String[] args) {

		double[][] notasAluno = new double[3][4];
		
		notasAluno[0][0] = 10;
		notasAluno[0][1] = 7;
		notasAluno[0][2] = 9;
		notasAluno[0][3] = 9.5;
		
		notasAluno[1][0] = 9;
		notasAluno[1][1] = 8;
		notasAluno[1][2] = 7;
		notasAluno[1][3] = 9;
		
		notasAluno[2][0] = 8;
		notasAluno[2][1] = 9;
		notasAluno[2][2] = 10;
		notasAluno[2][3] = 7;
		
		for(int i = 0; i<notasAluno.length;i++) {
			//System.out.print(notaAlunos[i] + " ");
			for(int j = 0; j<notasAluno[i].length;j++) {
				System.out.print(notasAluno[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Calculando a média de cada aluno:");
		
		double soma;
		for(int i = 0; i<notasAluno.length;i++) {
			soma =0;
			for(int j = 0; j<notasAluno[i].length;j++) {
				soma +=notasAluno[i][j];
				
			}
			System.out.println("Média do aluno " + i + " é = " + (soma/4));
		}
		
		//double[] notasAluno1 = {7,8,9,10 } ;
		double[][] notasAluno2 = {{7,8,9,10},{4,5,9,7},{4,5,9,7}};
		
		System.out.println();
		System.out.println("Output da mariz notasAluno2");
		
		for(int i = 0; i<notasAluno2.length;i++) {
			for(int j = 0; j<notasAluno2[i].length;j++) {
				System.out.print(notasAluno2[i][j] + " ");
		}
			System.out.println();
			}
			
	}

}
