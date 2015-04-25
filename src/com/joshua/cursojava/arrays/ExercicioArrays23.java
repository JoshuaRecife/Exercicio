package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays23 {

	public static void main(String[] args) {
//	23. N�meros pal�ndromos s�o aqueles que escritos da direita para a esquerda t�m o 
//		mesmo valor quando escritos da esquerda para a direita. Exemplo: 
//		545; 789987; 97379; 123454321; etc. Escreva um programa que verifique se um dado 
//		vetor A de 10 elementos inteiros � um pal�ndromo, ou seja, se o primeiro elemento 
//		do vetor � igual ao	�ltimo, se o segundo elemento do vetor � igual ao pen�ltimo e assim
//		por diante at� verificar todos os elementos ou chegar a conclus�o que o vetor n�o � um pal�ndromo.
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		boolean palindromo = true;
		
		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite somente n�meros pares na posi��o:  "+i);
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
			System.out.println("Pal�ndromo");
		}else{
			System.out.println("N�o � pal�ndromo");
		}
	}
}
