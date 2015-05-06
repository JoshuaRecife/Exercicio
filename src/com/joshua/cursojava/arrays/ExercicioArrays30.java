package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays30 {

	public static void main(String[] args) {
//	30) Ler um vetor A com 20 elementos. Separar os elementos pares e
//		�mpares de A utilizando apenas um vetor extra B. Sugest�o: no in�cio
//		do vetor B armazene os elementos pares de A e nas posi��es
//		restantes do vetor B armazene os elementos de A que s�o �mpares.
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		
		int contB = 0;
				
		for(int i = 0;i<vetorA.length;i++){
			System.out.println("Digite o n�mero no vetor A da posi��o: "+i);
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
