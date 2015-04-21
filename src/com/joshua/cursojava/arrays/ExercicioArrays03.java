package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays03 {

	public static void main(String[] args) {
//	03) Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho,
//		Sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja 
//		B[i] = A[i] * A[i].
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];

		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite o vetor A de posição: "+i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		System.out.println("Quantidade de vetor A: "+vetorA.length);
		System.out.print("Vetor A: ");
		for(int vetoresA : vetorA){
			System.out.print(vetoresA+" ");
		}
		System.out.println(" ");
		System.out.println("Quantidade de vetor B: "+vetorB.length);
		System.out.print("Vetor B: ");
		for(int vetoresB : vetorB){
			System.out.print(vetoresB+" ");
		}
	}
}
