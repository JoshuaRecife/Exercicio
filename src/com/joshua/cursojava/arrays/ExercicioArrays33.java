package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays33 {

	public static void main(String[] args) {
//	33) Criar um vetor A com 10 elementos inteiros. Escreva um programa que
//		imprima cada elemento do vetor A e a rela��o de todos os pares de 0
//		at� o respectivo elemento.	
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println("Digite o valor da posi��o: "+i);
			vetorA[i] = scan.nextInt();
		}
		for(int i=0; i<vetorA.length; i++){
			System.out.println("Analisando o n�mero: "+vetorA[i]);
			
			for(int j = 2;j<vetorA[i];j++){
				if(j % 2 == 0){
					System.out.println(j+" � par");
				}
			}
			System.out.println();
		}
	}
}
