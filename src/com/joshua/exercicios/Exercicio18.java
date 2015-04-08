package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
//		18 - Faça um programa que peça um número inteiro e determine 
//		se ele é ou não um número primo. Um número primo é aquele que é 
//		divisível somente por ele mesmo e por 1.
		Scanner scan = new Scanner(System.in);
		int num;
		boolean primo = true;
		
		System.out.println("Digite um número inteiro para determinar se é primo ou não.");
		num = scan.nextInt();
		
		for(int i = 2; i < num;i++){
			if(num % i == 0){
				System.out.println("Não é um número primo");
				primo = false;
				break;
			}
		}
		if(primo){
			System.out.println("Este é um número primo");
		}
	}
}
