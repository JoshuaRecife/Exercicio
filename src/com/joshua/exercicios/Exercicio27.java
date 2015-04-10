package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
//	27) Encontrar números primos é uma tarefa difícil. Faça um programa que gere uma lista
//		dos números primos existentes entre 1 e um número inteiro informado pelo usuário.
		
		Scanner scan = new Scanner(System.in);
		int num;
		boolean primo;
		
		System.out.println("Digite um número inteiro para determinar se é primo ou não.");
		num = scan.nextInt();
		
		System.out.println("Números primos entre 1 e "+num);
		for(int i=1; i<=num;i++){
			primo = true;

			for(int j=2; j<i ;j++){
				if(i % j == 0){
					
				primo = false;
				}
			}
			if(primo){
				System.out.println(i);
			}
		}
	}
}
