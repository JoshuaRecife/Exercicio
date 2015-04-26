package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays23 {

	public static void main(String[] args) {
//	23. Números palíndromos são aqueles que escritos da direita para a esquerda têm o 
//		mesmo valor quando escritos da esquerda para a direita. Exemplo: 
//		545; 789987; 97379; 123454321; etc. Escreva um programa que verifique se um dado 
//		vetor A de 10 elementos inteiros é um palíndromo, ou seja, se o primeiro elemento 
//		do vetor é igual ao	último, se o segundo elemento do vetor é igual ao penúltimo e assim
//		por diante até verificar todos os elementos ou chegar a conclusão que o vetor não é um palíndromo.
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		boolean palindromo = true;
		
		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite 10 números para formar um palíndromo. Digite o número da posição:  "+i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<(vetorA.length/2);i++){
			if (vetorA[i] != vetorA[vetorA.length - 1- i]){
				palindromo = false;
				break;
			}
		}
			System.out.println("Qdt do vetor A: "+vetorA.length);
			System.out.print("Vetor A: ");
		for(int vetoresA : vetorA){
			System.out.print(vetoresA+" ");
		}
		System.out.println();
		if(palindromo){
			System.out.println("Palíndromo");
		}else{
			System.out.println("Não é palíndromo");
		}
	}
}
