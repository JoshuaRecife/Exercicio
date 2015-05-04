package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays24 {

	public static void main(String[] args) {
//	24) Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo
//		e tamanho, obedecendo as seguintes regras de formaçao:
//		a) Bi deverá receber 1 quando Ai for par;
//		b) Bi deverá receber 0 quando Ai for impar.
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int cont = 0;
		for(int i=0;i<vetorA.length;i++){
			System.out.println("Digite o valor do Vetor A da posição: "+i);
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 == 0){
				cont++;
				vetorB[i] = 1;
			}else{
				vetorB[i] = 0;
			}
		}
		System.out.println("Qtd do vetor A: "+vetorA.length);
		System.out.println("Números pares: "+cont);
		System.out.println("Números ímpares: "+(vetorA.length-cont));
		System.out.print("Vetor A = ");
		for(int vetoresA : vetorA){
			System.out.print(+vetoresA+" ");
		}
		System.out.println();
		System.out.println("Qtd do vetor B: "+vetorA.length);
		System.out.print("Vetor B = ");
		for(int vetoresB : vetorB){
			System.out.print(+vetoresB+" ");
		}
	}
}
