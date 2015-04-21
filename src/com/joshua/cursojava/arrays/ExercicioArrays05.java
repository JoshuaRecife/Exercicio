package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays05 {

	public static void main(String[] args) {
//	05) Criar um vetor A com 10 elementos inteiros. Construir um vetor B 
//		de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
//		ser o respectivo elemento de A multiplicado por sua posição (ou índice), ou seja:
//		B[i] = A[i] * i.
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite o vetor A da posição: "+i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * i;
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
	}
}
