package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		//07
		/* Fa�a um programa que leia 5 n�meros e infome o maior n�mero */
		Scanner scan = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE;
	
		for(int i=5; i >= 1; i--){
			System.out.println(+i+". Digite um n�mero inteiro.");
			num = scan.nextInt();
			
			if(num > maior){
				maior = num;
			}
		}
		System.out.println("O n�mero maior foi: "+maior);
	}
}
