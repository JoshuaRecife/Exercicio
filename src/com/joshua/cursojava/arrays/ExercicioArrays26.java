package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays26 {

	public static void main(String[] args) {
//	26) Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo
//		e tamanho, obedecendo as seguintes regras de forma��o:
//		a) Bi dever� receber 'a' quando Ai for menor que 7;
//		b) Bi dever� receber 'b' quando Ai for igual a 7;
//		c) Bi dever� receber 'c' quando Ai for maior que 7 e menor que 10;
//		d) Bi dever� receber 'd' quando Ai for igual a 10; e
//		e) Bi dever� receber 'e' quando Ai for maior que 10. 
//		Sugest�o: char B[10];
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		char[] vetorB = new char[vetorA.length];

		for(int i = 0;i<vetorA.length;i++){
				System.out.println("Digite um n�mero para o vetor A na posi��o: "+i);
				vetorA[i] = scan.nextInt();
			if(vetorA[i] < 7){
				vetorB[i] = 'a';
			}else if(vetorA[i] == 7){
				vetorB[i] = 'b';
				}else if(vetorA[i] > 7 && vetorA[i] < 10){
						vetorB[i] = 'c';
					}else if(vetorA[i] == 10){
								vetorB[i] = 'd';
						}else if(vetorA[i] > 10){
									vetorB[i] = 'e';
			} 
		}
		System.out.println("Qtd do Vetor A: "+vetorA.length);
		System.out.println("Qtd do Vetor B: "+vetorA.length);
		
		System.out.print("Vetor A: ");
		for(int vetoresA : vetorA){
			System.out.print(vetoresA+" ");
		}
		System.out.println();
		System.out.print("Vetor B: ");
		for(char vetoresB : vetorB){
			System.out.print(vetoresB+" ");
		}
	}
}

