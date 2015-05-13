package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays35 {

	public static void main(String[] args) {
//	35) Criar um vetor A com 11 elementos, indexados de 0 at� 10. Sendo que
//		cada elemento do vetor A � formado pela pot�ncia de base 2 elevado
//		ao expoente igual a posi��o do respectivo elemento, ou seja:
//		A[i] = 2i. Sugest�o int A[11];	
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[11];
		
		for(int i=0; i<vetorA.length; i++){
			vetorA[i] = (int) Math.pow(2, i);
		}
		System.out.print("Vetora A = ");
		for(int i=0;i<vetorA.length;i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

	}

}
