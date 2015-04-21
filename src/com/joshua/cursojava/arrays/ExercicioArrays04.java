package com.joshua.cursojava.arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioArrays04 {

	public static void main(String[] args) {
//  04) Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo
//		tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do 
//		respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];

		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite o vetor A da posição: "+i);
			vetorA[i] = scan.nextInt(); 
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		System.out.println("Quantidade de vetor A: "+vetorA.length);
		System.out.print("Vetor A: ");
		for(int vetoresA : vetorA){
			System.out.print(vetoresA+" ");
		}
		System.out.println(" ");
		System.out.println("Quantidade de vetor b: "+vetorB.length);
		System.out.print("Vetor B: ");
		for(double vetoresB : vetorB){
			System.out.print(df.format(vetoresB)+" ");
		}
	}
}
