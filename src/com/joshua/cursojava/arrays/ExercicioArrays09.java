package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays09 {

	public static void main(String[] args) {
//	09) Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
//		um vetor C, onde cada elemento de C é a divisão dos respectivos
//		elementos em A e B, ou seja: C[i] = A[i] / float(B[i]).	
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		float[] vetorB = new float[vetorA.length];
		float[] vetorC = new float[vetorA.length];
		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite o vetor A da posição: "+i);
			vetorA[i] = scan.nextInt();
		}
		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite o vetor B da posição: "+i);
			vetorB[i] = scan.nextFloat();
			vetorC[i] = vetorA[i] / vetorB[i];
		}
		System.out.println("Quantidade do Vetor A: "+vetorA.length);
		System.out.print("Vetor A: ");
		for(int vetoresA : vetorA){
			System.out.print(vetoresA+" ");
		}
		System.out.println();
		System.out.println("Quantidade do Vetor B: "+vetorA.length);
		System.out.print("Vetor B: ");
		for(float vetoresB : vetorB){
			System.out.print(vetoresB+" ");
		}
		System.out.println();
		System.out.println("Quantidade do Vetor C: "+vetorA.length);
		System.out.print("Vetor C: ");
		for(float vetoresC : vetorC){
			System.out.print(vetoresC+" ");
		}
	}
}
