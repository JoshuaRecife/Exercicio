package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays28 {

	public static void main(String[] args) {
//	28) Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
//		sendo este a jun��o dos dois outros vetores. Os primeiros 10
//		elementos de C dever�o receber os elementos de A e os �ltimos
//		elementos C dever�o receber os elementos de B. Desta forma, C
//		dever� ter o dobro de elementos de A e B, ou seja, 20 elementos.
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length + vetorB.length];
		
		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite um n�mero para o vetor A na posi��o: "+i);
			vetorA[i] = scan.nextInt();
			
			vetorC[i] = vetorA[i];
			
			//Pode-se colocar outro for aqui, fechando o de cima e come�ando outro para o vetorB
			System.out.println("Digite um n�mero para o vetor B na posi��o: "+i);
			vetorB[i] = scan.nextInt();
			
			vetorC[vetorA.length + i] = vetorB[i];
			
		}
		System.out.println("Qtd do Vetor A: "+vetorA.length);
		System.out.println("Qtd do Vetor B: "+vetorA.length);
		System.out.println("Qtd do Vetor C: "+vetorC.length);
		
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
