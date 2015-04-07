package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
	//13
	/* Faça um programa que peça dois números, base e expoente, 
	 * calcule e mostre o primeiro número elevado ao segundo número.
	 * Não utilize a função de pontência da linguagem.  */
	   Scanner scan = new Scanner(System.in);
	   
	   int base, expoente;
	   int result = 1;
	   
	   System.out.println("Digite um número para calcular a 'base'");
	   base = scan.nextInt();
	   
	   System.out.println("Digite um número para calcular o 'expoente'");
	   expoente = scan.nextInt();
	   
	   for(int i = 1;i <= expoente;i++){
		   result *= base;
	   }
	   	   System.out.println(result);
	}
}
