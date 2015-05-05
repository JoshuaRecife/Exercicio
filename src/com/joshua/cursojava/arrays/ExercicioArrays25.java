package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays25 {

	public static void main(String[] args) {
//	25) Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C
//		de mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
//		a) Ci deverá receber 1 quando Ai for maior que Bi;
//		b) Ci deverá receber 0 quando Ai for igual a Bi;
//		c) Ci deverá receber -1 quando Ai for menor que Bi.
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite um número para o vetor A na posição: "+i);
			vetorA[i] = scan.nextInt();
			System.out.println("Digite um número para o vetor B na posição: "+i);
			vetorB[i] = scan.nextInt();

			if(vetorA[i] > vetorB[i]){
				vetorC[i] = 1; 
			}else if(vetorA[i] == vetorB[i]){
				vetorC[i] = 0;
			}else if(vetorA[i] < vetorB[i]){
				vetorC[i] = -1;
			}
		}
			System.out.println("Qtd de Vetor A: "+vetorA.length);
			System.out.println("Qtd de Vetor B: "+vetorA.length);
			System.out.println("Qtd de Vetor C: "+vetorA.length);
			System.out.print("Vetor A: ");
		for(int vetoresA : vetorA){
			System.out.print(vetoresA+" ");
		}
			System.out.println();
			System.out.print("Vetor B: ");
		for(int vetoresB : vetorB){
			System.out.print(vetoresB+" ");
		}
			System.out.println();
			System.out.print("Vetor C: ");
		for(int vetoresC : vetorC){
			System.out.print(vetoresC+" ");
		}
	}
}
