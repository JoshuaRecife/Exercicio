package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		//17 - Faça um programa que calcule o fatorial de um número inteiro
		// fornecido pelo usuário. Ex: 5! = 5.4.3.2.1 = 120
		Scanner scan = new Scanner(System.in);
		int num;
		int fatorial = 1;
		
		System.out.println("Digite um número inteiro para o cálculo fatorial");
		num = scan.nextInt();
		
		System.out.print(num+"! = ");
		
		for(int i = num;i >= 1 ;i-- ){
			fatorial *= i;
			System.out.print(i);
			
			if(i > 1){
			System.out.print(".");
			}
		}
		System.out.println(" = "+fatorial);
	}
}
