package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays01 {

	public static void main(String[] args) {
//		1) Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
//		mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0;i<vetorA.length;i++){
			System.out.println("Digite o valor da posição: "+i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i];
		}
		System.out.println("Quantidade de Vetores A: "+vetorA.length);
		System.out.println("Tipo de Vetores A: ");
		for(int vetA : vetorA){
			System.out.print(vetA);
		}
		System.out.println(" ");
		System.out.println("Quantidade de Vetores B: "+vetorB.length);
		System.out.println("Tipo de Vetores B: ");
		for(int vetB : vetorB){
			System.out.print(vetB);
		}
	}
}
