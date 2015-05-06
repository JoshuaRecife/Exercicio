package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays29 {

	public static void main(String[] args) {
//	29) Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
//		que nos vetor B e C serão armazenados o valores pares e ímpares de
//		A, respectivamente.	
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		int contB = 0;
		int contC = 0;
				
		for(int i = 0;i<vetorA.length;i++){
			System.out.println("Digite o número no vetor A da posição: "+i);
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 == 0){
				vetorB[contB] = vetorA[i];
				contB++;
			}else{
				vetorC[contC] = vetorA[i];
				contC++;
			}
		}
		System.out.println("Qtd do Vetor A: "+vetorA.length);
		System.out.println("Qtd do Vetor B: "+vetorA.length);
		System.out.println("Qtd do Vetor C: "+vetorC.length);
		
		System.out.print("Vetor A: ");
		for(int vetoresA : vetorA){
			System.out.print(vetoresA+" ");
		}
		System.out.println();
		System.out.print("Vetor B: ");
		for(int i=0;i<contB;i++){
			System.out.print(vetorB[i]+" ");
		}
		System.out.println();
		System.out.print("Vetor C: ");
		for(int i=0;i<contC;i++){
			System.out.print(vetorC[i]+" ");
		}
	}
}
