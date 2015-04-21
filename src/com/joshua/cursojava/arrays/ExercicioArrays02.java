package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays02 {

	public static void main(String[] args) {
//		2) Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho
//		e com os elementos do vetor A multiplicados por 2, o seja: B[i] = A[i]*2
		Scanner scan = new Scanner(System.in);
		int[] numA = new int[8];
		int[] numB = new int[numA.length];
	
		for(int i=0;i <numA.length;i++){
			System.out.println("Números do vetor A da posição: "+i);
			numA[i] = scan.nextInt();
			numB[i] = numA[i]*2;
		
		}
			System.out.println("Quantidade de vetores A: "+numA.length);
			System.out.print("Vetor A: ");
		for(int vetoresA : numA){
			System.out.print(vetoresA+" ");
		}
			System.out.println(" ");
			System.out.println("Quantidade de vetores B: "+numB.length);
			System.out.print("Vetor B: ");
		for(int vetoresB : numB){
			System.out.print(vetoresB+" ");
		}
	}
}
