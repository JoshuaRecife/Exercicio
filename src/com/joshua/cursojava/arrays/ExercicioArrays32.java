package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays32 {

	public static void main(String[] args) {
//	32) Criar um vetor A com 10 elementos inteiros. Escreva um programa que
//		imprima cada elemento do vetor A e uma mensagem indicando se o
//		respectivo elemento � um n�mero primo ou n�o.	
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		boolean primo;
		String msg = "";
		
		for(int i = 0;i<vetorA.length;i++){
			System.out.println("Digite o valor da posi��o: "+i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0;i<vetorA.length;i++){
			primo = true;
			for(int j = 2; j<vetorA[i]; j++){
				if(vetorA[i] % j == 0){
					primo = false;
					break;
				}
			}
			
			if(primo){
				msg = " - primo";
			}else{
				msg = " - n�o � primo";
			}
				
			System.out.println(vetorA[i] + msg );
		}

	}
}
