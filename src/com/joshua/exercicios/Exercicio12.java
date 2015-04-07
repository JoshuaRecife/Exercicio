package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		//12
		/* Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer n�mero
		   inteiro entre 1 e 10. O usu�rio deve informar de qual n�mero ele deseja ver a 
		   tabuada. A sa�da deve ser conforme o exemplo abaixo:
		   Tabuada de 5:
		   5 x 1 = 5
		   5 x 2 = 10
		   ...
		   5 x 10 = 50  */
		Scanner scan = new Scanner(System.in);	
		int num;

		System.out.println("Digite um n�mero inteiro para formar a tabuada");
		num = scan.nextInt();
		
		System.out.println("Tabuada de "+num+":");
		
		for(int i = 1;i <= 10;i++){
			System.out.println(+num+" x "+i+" = " +num*i);
		}
	}
}
