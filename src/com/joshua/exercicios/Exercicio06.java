package com.joshua.exercicios;

public class Exercicio06 {

	public static void main(String[] args) {
		//06
		/* Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
		 * Depois modifique o programa para que ele mostre os números um ao lado do outro.   */
		
		for(int i=1; i<=20; i++){
			System.out.println(i);
		}
		System.out.print("");
		
		System.out.print(1);
		for(int i=2; i<=20; i++){
			System.out.print(" - "+i);
		}
	}
}
