package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
	//13
	/* Fa�a um programa que pe�a dois n�meros, base e expoente, 
	 * calcule e mostre o primeiro n�mero elevado ao segundo n�mero.
	 * N�o utilize a fun��o de pont�ncia da linguagem.  */
	   Scanner scan = new Scanner(System.in);
	   
	   int base, expoente;
	   int result = 1;
	   
	   System.out.println("Digite um n�mero para calcular a 'base'");
	   base = scan.nextInt();
	   
	   System.out.println("Digite um n�mero para calcular o 'expoente'");
	   expoente = scan.nextInt();
	   
	   for(int i = 1;i <= expoente;i++){
		   result *= base;
	   }
	   	   System.out.println(result);
	}
}
