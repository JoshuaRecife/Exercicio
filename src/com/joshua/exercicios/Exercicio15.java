package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
	//15 - A série de Fibonacci é formada pela sequência de 0,1,1,2,3,5,8,13,21,34,55...
	// Faça um programa capaz de gerar a série até o n-ésimo termo.
	Scanner scan = new Scanner(System.in);
	int num, proximo;
	int primeiro = 1;
	int segundo = 1;
	
	System.out.println("Digite o n-ésimo termo do Fibonacci");
	num = scan.nextInt();
	
	System.out.println(primeiro);
	System.out.println(segundo);
	
	for(int i = 3 ;i <= num ;i++ ){
		proximo = primeiro+segundo;
		primeiro = segundo;
		segundo = proximo;
		System.out.println(proximo);
	}
		
	}
}
