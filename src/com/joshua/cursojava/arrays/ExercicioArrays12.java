package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays12 {

	public static void main(String[] args) {
//	12) Criar um vetor A com 10 elementos inteiros. Implementar um programa
//	que defina e escreva a soma de todos os elementos armazenados
//	neste vetor.
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma =0;
		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite o vetor A da posição: "+i);
			vetorA[i] = scan.nextInt();
			soma += vetorA[i];
		}
			System.out.println("Qtd de vetor A: "+vetorA.length);
			System.out.print("Vetor A: ");
		for(int vetoresA : vetorA){
			System.out.print(vetoresA+" ");
		}
			System.out.println();
			System.out.println("A soma de todos os elementos do vetor A: "+soma);
	}
}
