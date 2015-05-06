package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays30 {

	public static void main(String[] args) {
//	30) Ler um vetor A com 20 elementos. Separar os elementos pares e
//		ímpares de A utilizando apenas um vetor extra B. Sugestão: no início
//		do vetor B armazene os elementos pares de A e nas posições
//		restantes do vetor B armazene os elementos de A que são ímpares.
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		
		int contB = 0;
				
		for(int i = 0;i<vetorA.length;i++){
			System.out.println("Digite o número no vetor A da posição: "+i);
			vetorA[i] = scan.nextInt();
		}
				
		for(int i = 0;i<vetorA.length;i++){
			if(vetorA[i] % 2 == 0){
				vetorB[contB] = vetorA[i];
				contB++;
			}
		}
			
		for(int i = 0;i<vetorA.length;i++){
			if(vetorA[i] % 2 != 0){
				vetorB[contB] = vetorA[i];
				contB++;
			}
		}
		
		System.out.println("Qtd do Vetor A: "+vetorA.length);
		System.out.println("Qtd do Vetor B: "+vetorA.length);
	
		System.out.print("Vetor A: ");
		for(int vetoresA : vetorA){
			System.out.print(vetoresA+" ");
		}
		System.out.println();
		System.out.print("Vetor B: ");
		for(int i=0;i<contB;i++){
			System.out.print(vetorB[i]+" ");
		}
	}
}
