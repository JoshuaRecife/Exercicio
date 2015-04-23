package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays13 {

	public static void main(String[] args) {
//		13. Criar um vetor A com 10 elementos inteiros. Implementar um programa
//		que determine a soma dos elementos armazenados neste vetor que
//		são múltiplos de 5.
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma=0;
		
		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite o vetor A da posição: "+i);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 5 == 0){
				soma += vetorA[i];
			}
		}
			System.out.println("Qdt do vetor A: "+vetorA.length);
			System.out.print("Vetor A: ");
		for(int vetoresA : vetorA){
				System.out.print(vetoresA+" ");
		}
			System.out.println();
			System.out.println("Soma dos vetores múltpilos de 5: "+soma);
	}
}
