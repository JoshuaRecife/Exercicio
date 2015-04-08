package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
//		21) Faça um programa que calcule o número médio de alunos por turma.
//			Para isto, peça a quantidade de turmas e a quantidade de alunos para
//			cada turma. As turmas não podem ter mais de 40 alunos.
		Scanner scan = new Scanner(System.in);
		
		int qtdTurma,qtdAlunos,soma = 0; 
		double media;
		boolean condicao;
		
		System.out.println("Digite a quantidade de turmas");
		qtdTurma = scan.nextInt();
		
		for(int i =0;i < qtdTurma ;i++){
		do{
			System.out.println("Digite quantos alunos tem na "+(i+1) +"º turma");
			qtdAlunos = scan.nextInt();
		
			if(qtdAlunos < 40){
				 condicao = true;
				
			}else{
				 condicao = false;
				 System.out.println("Quantidade de alunos inválida, digite até 40.");
			}
		}while(!condicao);
		
		soma += qtdAlunos;
		
		}
		media = soma/qtdTurma;
		
		System.out.println("A média de alunos das "+qtdTurma+" turmas é de: "+media+" alunos.");
		
	}

}
