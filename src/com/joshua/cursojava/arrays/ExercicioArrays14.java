package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays14 {

	public static void main(String[] args) {
//	14) Criar um vetor A com 10 elementos inteiros. Implementar um programa
//		que defina e escreva a m�dia aritm�tica simples dos elementos
//		�mpares armazenados neste vetor.
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma = 0;
		float media = 0;
		int cont = 0;
		
		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite o vetor A da posi��o: "+i);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 2 != 0){
				cont++;
				soma +=vetorA[i];
			}
		}
			media = soma / cont;
			System.out.println("Qdt de vetor A: "+vetorA.length);
			System.out.print("Vetor A: ");
			for(int vetoresA : vetorA){
				System.out.print(vetoresA+" ");
			}
				System.out.println();
				System.out.println("Qtd de �mpares: "+cont);
				System.out.println("Soma dos vetores �mpares: "+soma);
				System.out.println("M�dia dos vetores 'A' �mpares: "+media);
	}

}
