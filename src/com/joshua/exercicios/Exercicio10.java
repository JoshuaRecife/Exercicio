package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		//10
		/* Fa�a um programa que receba dois n�meros inteiros e gere os n�meros
		 * inteiros que est�o no intervalo compreendido por eles. */
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite um n�mero inteiro");
		num1 = scan.nextInt();
		
		System.out.println("Digite um n�mero inteiro maior que: "+num1);
		num2 = scan.nextInt();
		
		for(int i = num1;i <= num2;i++){
			System.out.println(i);
		}
	}
}
