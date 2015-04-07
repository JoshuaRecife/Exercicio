package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		//10
		/* Faça um programa que receba dois números inteiros e gere os números
		 * inteiros que estão no intervalo compreendido por eles. */
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite um número inteiro");
		num1 = scan.nextInt();
		
		System.out.println("Digite um número inteiro maior que: "+num1);
		num2 = scan.nextInt();
		
		for(int i = num1;i <= num2;i++){
			System.out.println(i);
		}
	}
}
