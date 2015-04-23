package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays10 {

	public static void main(String[] args) {
//	10) Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
//		mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
//		ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
//		seja: B[i] := A[i] % 2.	
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite o valor do vetor A da posição: "+i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] % 2;
		}
		System.out.print("Qtd.: "+vetorA.length+" Vetor A: ");
		for(int vetoresA : vetorA){
			System.out.print(vetoresA+" ");
		}
		System.out.println();
		System.out.print("Qtd.: "+vetorA.length+" Vetor B: ");
		for(int vetoresB : vetorB){
			System.out.print(vetoresB+" ");
		}
	}
}
