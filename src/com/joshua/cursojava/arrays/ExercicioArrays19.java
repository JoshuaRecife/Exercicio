package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays19 {

	public static void main(String[] args) {
//	19) Ler as duas notas bimestrais para um conjunto de 10 alunos.	Armazenar as notas 
//		informadas em dois vetores �Nota1� e �Nota2� do tipo real. Escreva um programa 
//		que calcule a m�dia aritm�tica simples das notas informadas armazenando o 
//		resultado em um vetor �Result� de mesmo tipo e tamanho. Ao mostrar os resultados
//		exibir a situa��o de cada aluno. Se a m�dia calculada for superior ou igual a 7 o aluno
//		estar� �aprovado�, caso contr�rio, a situa��o do aluno ser� �reprovado�.	
		Scanner scan = new Scanner(System.in);
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] result = new double[notas1.length];
		int cont = 0;
		
		for(int i=0;i<notas1.length;i++){
			System.out.println("Digite a nota 1 do aluno: "+i);
			notas1[i] = scan.nextDouble();
			
			System.out.println("Digite a nota 2 do aluno: "+i);
			notas2[i] = scan.nextDouble();
			
			result[i] = (notas1[i] + notas2[i])/2;
		}
		for(double resultados : result){
			if(resultados >= 7){
				System.out.println("Aluno "+cont++ +" = Aprovado.");
			}else{
				System.out.println("Aluno "+cont++ +" = Reprovado.");
			}
		}
	}
}
