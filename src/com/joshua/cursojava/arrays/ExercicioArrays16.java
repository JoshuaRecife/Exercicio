package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays16 {

	public static void main(String[] args) {
//	16) Criar um vetor A com 10 elementos inteiros. Escrever um programa
//		que calcule e escreva: 
//		a) A soma de elementos armazenados neste vetor que são inferiores a 15; 
//		b) A quantidade de elementos armazenados no vetor que são iguais a 15; e 
//		c) A média dos elementos armazenados no vetor que são superiores a 15.
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int somaInf15 = 0;
		int igual15 = 0;
		int somaSup15 = 0;
		double media = 0;
		
		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite o vetor A da posição: "+i);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] < 15){
				somaInf15 += vetorA[i];
			}else if(vetorA[i] == 15){
				igual15++;
			}else{
				somaSup15 += vetorA[i];
				media++;
			}
		}
			System.out.println("Qtd de vetor A: "+vetorA.length);
			System.out.print("Vetor A = ");
			for(int vetoresA : vetorA){
				System.out.print(vetoresA+" ");
			}
			System.out.println();
			System.out.println("Soma dos elementos inferior a 15 = "+somaInf15);
			System.out.println("Qtd dos elementos iguais a 15 = "+igual15);
			System.out.println("Média dos elementos superior a 15 = "+somaSup15/media);
	}
}
