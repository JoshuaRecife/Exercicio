package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		//08
		/* Fa�a um programa que leia 5 n�meros e
		 * informe a soma e a m�dia dos n�meros.  */
		Scanner scan = new Scanner(System.in);
			
		int num;
		int soma = 0;
		double media;
		
		for(int i = 1; i <= 5; i++){
			System.out.println("Digite um n�mero inteiro.");
			num = scan.nextInt();
			
			soma += num;
		}
		media = soma/5;
		System.out.println("A soma dos n�meros: "+soma);
		System.out.println("A m�dia dos n�meros: "+media);
	}
}
