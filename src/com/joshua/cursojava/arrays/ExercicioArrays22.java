package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays22 {

	public static void main(String[] args) {
//	22) Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
//		que verifique se "todos" os elementos do vetor A s�o pares. Se pelo
//		menos um elemento do vetor n�o for par o processo de repeti��o para
//		percorrer os elementos do vetor deve ser encerrado, como sugest�o:
//		utilize uma vari�vel do tipo flag para atingir este prop�sito.
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for(int i=0;i<vetorA.length;i++){
		
			System.out.println("Digite somente n�meros pares na posi��o:  "+i);
			vetorA[i] = scan.nextInt();
		
			if(vetorA[i] % 2 == 0){
			}else{
				break;
			}
		}
			System.out.println("Qdt do vetor A: "+vetorA.length);
			System.out.print("Vetor A: ");
		for(int vetoresA : vetorA){
			System.out.print(vetoresA+" ");
		}
	}
}
