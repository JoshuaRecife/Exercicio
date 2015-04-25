package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays22 {

	public static void main(String[] args) {
//	22) Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
//		que verifique se "todos" os elementos do vetor A são pares. Se pelo
//		menos um elemento do vetor não for par o processo de repetição para
//		percorrer os elementos do vetor deve ser encerrado, como sugestão:
//		utilize uma variável do tipo flag para atingir este propósito.
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for(int i=0;i<vetorA.length;i++){
		
			System.out.println("Digite somente números pares na posição:  "+i);
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
