package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		//16 - A s�rie de Fibonacci � formada pela sequ�ncia 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
		//Fa�a um programa que gere a s�rie at� o que o valor seja maior que 500.
		Scanner scan = new Scanner(System.in);
		int proximo = 0;
		int primeiro = 1;
		int segundo = 1;
		System.out.println(primeiro);
		System.out.println(segundo);
			while(proximo < 500){
				proximo = primeiro+segundo;
				primeiro = segundo;
				segundo = proximo;
				System.out.println(proximo);
		}
	}
}
