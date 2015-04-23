package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays17 {

	public static void main(String[] args) {
//	17. Ler um vetor A com 10 elementos inteiros correspondentes as idades
//		de um grupo de pessoas. Escreva um programa que determine e
//		escreva a quantidade de pessoas que possuem idade superior a 35	anos.
		Scanner scan = new Scanner(System.in);
		int[] idade = new int[10];
		int cont = 0;
		for(int i=0;i<idade.length;i++){
			System.out.println("Digite uma idade na posição: "+i);
			idade[i] = scan.nextInt();
			
			if(idade[i] > 35){
				cont++;
			}
		}
			System.out.println("Qdt de Pesssoas = "+idade.length);
			System.out.print("Idades = ");
			for(int entradaIdade : idade){
				System.out.print(entradaIdade+" ");
			}
			System.out.println();
			System.out.println("Qdt de Pesssoas com mais de 35 anos = "+cont);
	}
}
