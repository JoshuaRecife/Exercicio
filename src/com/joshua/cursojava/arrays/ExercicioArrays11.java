package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays11 {

	public static void main(String[] args) {
//	11) Criar um vetor A com 10 elementos inteiros. Implementar um programa
//		que defina e escreva a quantidade de elementos armazenados neste
//		vetor que s�o pares.	
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int cont = 0;
		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite o valor do Vetor A da posi��o: "+i);
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 == 0){
				cont++;
			}
		}
		System.out.println("Qtd do vetor A: "+vetorA.length);
		System.out.println("N�meros pares: "+cont);
		System.out.print("Vetor A = ");
		for(int vetoresA : vetorA){
			System.out.print(+vetoresA+" ");
		}
	}
}
