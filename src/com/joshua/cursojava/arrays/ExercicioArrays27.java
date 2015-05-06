package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays27 {

	public static void main(String[] args) {
//	27) Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo
//		e tamanho e com os mesmos elementos de A, sendo que estes deverão estar
//		invertidos, ou seja, o primeiro elemento de A passa a ser o último de B,
//		o segundo elemento de A passa a ser o penúltimo de B e assim por diante.
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite um número para o vetor A na posição: "+i);
			vetorA[i] = scan.nextInt();
			
			vetorB[vetorA.length - i - 1] = vetorA[i];
		}
		System.out.println("Qtd do Vetor A: "+vetorA.length);
		System.out.println("Qtd do Vetor B: "+vetorA.length);
		
		System.out.print("Vetor A: ");
		for(int vetoresA : vetorA){
			System.out.print(vetoresA+" ");
		}
		System.out.println();
		System.out.print("Vetor B: ");
		for(int vetoresB : vetorB){
			System.out.print(vetoresB+" ");
		}
	}
}
