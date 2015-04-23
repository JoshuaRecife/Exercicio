package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays15 {

	public static void main(String[] args) {
//	15) Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
//		que defina o percentual de elementos pares e ímpares,
//		respectivamente, armazenados neste vetor.	
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		double impar = 0;
		double par = 0;
		
		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite o vetor A da posição: "+i);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 2 != 0){
				++impar;
			}
		}
			par = vetorA.length - impar; 
		System.out.println("Qdt do vetor A: "+vetorA.length);
		System.out.print("vetor A: ");
		for(int vetoresA : vetorA){
			System.out.print(vetoresA+" ");
		}
		System.out.println();
		System.out.println(+impar+" números ímpares: "+((impar*100)/vetorA.length)+"%");
		System.out.println(+par+" números pares: "+((par*100)/vetorA.length)+"%");
	}
}
