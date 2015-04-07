package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
	//14 - Faça um programa que peça 10 números inteiros, calcule e mostre
	// a quantidade de números pares e a quantidade de números impares.
	Scanner scan = new Scanner(System.in);
	
	int num;
	int par = 0;
	int impar = 0;
	
	System.out.println("Digite 10 números inteiros.");
	
	for(int i=1;i <= 10;i++){
			System.out.println("Digite o "+(i)+ "º número inteiro");
			num = scan.nextInt();
		if(num % 2 == 0){
			par++;
		}else{
			impar++;
		}
	}
	System.out.println("Números pares: "+par);
	System.out.println("Números ímpares: "+impar);

	}
}
