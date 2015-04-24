package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays19 {

	public static void main(String[] args) {
//	19) Ler as duas notas bimestrais para um conjunto de 10 alunos.	Armazenar as notas 
//		informadas em dois vetores “Nota1” e “Nota2” do tipo real. Escreva um programa 
//		que calcule a média aritmética simples das notas informadas armazenando o 
//		resultado em um vetor “Result” de mesmo tipo e tamanho. Ao mostrar os resultados
//		exibir a situação de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
//		estará “aprovado”, caso contrário, a situação do aluno será “reprovado”.	
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
