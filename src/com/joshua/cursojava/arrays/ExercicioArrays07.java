package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays07 {

	public static void main(String[] args) {
//	07 Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C,
//	   onde cada elemento de C é a subtração dos respectivos elementos em A e B, ou seja:
//	   C[i] = A[i] - B[i] 
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite o valor do vetor A da posição: "+i);
			vetorA[i] = scan.nextInt();
		}

		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite o valor do vetor B da posição: "+i);
			vetorB[i] = scan.nextInt();
			vetorC[i] = vetorA[i] - vetorB[i];
		}
			System.out.println("Quant. de vetor A: "+vetorA.length);
			System.out.print("Vetor A: ");
		for(int vetoresA : vetorA){
			System.out.print(vetoresA+" ");
		}
			System.out.println();
			System.out.println("Quant. de vetor B: "+vetorB.length);
			System.out.print("Vetor B: ");
		for(int vetoresB : vetorB){
			System.out.print(vetoresB+" ");
		}
			System.out.println();
			System.out.println("Quant. de vetor C: "+vetorC.length);
			System.out.print("Vetor C: ");
		for(int vetoresC : vetorC){
			System.out.print(vetoresC+" ");
		}
	}
}
