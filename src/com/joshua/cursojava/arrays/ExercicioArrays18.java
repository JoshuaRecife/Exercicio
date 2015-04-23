package com.joshua.cursojava.arrays;

import java.util.Scanner;

public class ExercicioArrays18 {

	public static void main(String[] args) {
//	18. Ler um vetor A com 10 elementos inteiros correspondentes as idades
//		de um grupo de pessoas. Escreva um programa que determine e
//		escreva a menor e a maior idades e suas respectivas posições.
		Scanner scan = new Scanner(System.in);
		int[] idade = new int[10];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int posicaoMenor = 0;
		int posicaoMaior = 0;
		
		for(int i=0;i<idade.length;i++){
			System.out.println("Digite a idade da posição: "+i);
			idade[i] = scan.nextInt();
			
			if(idade[i] < menor){
				menor = idade[i];
				posicaoMenor = i;
			}else if(idade[i] > maior){
				maior = idade[i];
				posicaoMaior = i;
			}
		}
			System.out.println("Qdt de idades: "+idade.length);
			System.out.print("Idades: ");
		for(int vetores : idade){
			System.out.print(vetores+" ");
		}
			System.out.println();
			System.out.println("Idade Menor = "+menor+", na posição: "+posicaoMenor);
			System.out.println("Idade Maior = "+maior+", na posição: "+posicaoMaior);
	}
}
