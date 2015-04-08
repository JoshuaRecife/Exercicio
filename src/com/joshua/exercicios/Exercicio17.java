package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		//17 - Fa�a um programa que calcule o fatorial de um n�mero inteiro
		// fornecido pelo usu�rio. Ex: 5! = 5.4.3.2.1 = 120
		Scanner scan = new Scanner(System.in);
		int num;
		int fatorial = 1;
		
		System.out.println("Digite um n�mero inteiro para o c�lculo fatorial");
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
