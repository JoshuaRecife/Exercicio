package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		//08
		/* Faça um programa que leia 5 números e
		 * informe a soma e a média dos números.  */
		Scanner scan = new Scanner(System.in);
			
		int num;
		int soma = 0;
		double media;
		
		for(int i = 1; i <= 5; i++){
			System.out.println("Digite um número inteiro.");
			num = scan.nextInt();
			
			soma += num;
		}
		media = soma/5;
		System.out.println("A soma dos números: "+soma);
		System.out.println("A média dos números: "+media);
	}
}
