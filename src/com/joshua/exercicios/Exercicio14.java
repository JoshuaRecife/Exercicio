package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
	//14 - Fa�a um programa que pe�a 10 n�meros inteiros, calcule e mostre
	// a quantidade de n�meros pares e a quantidade de n�meros impares.
	Scanner scan = new Scanner(System.in);
	
	int num;
	int par = 0;
	int impar = 0;
	
	System.out.println("Digite 10 n�meros inteiros.");
	
	for(int i=1;i <= 10;i++){
			System.out.println("Digite o "+(i)+ "� n�mero inteiro");
			num = scan.nextInt();
		if(num % 2 == 0){
			par++;
		}else{
			impar++;
		}
	}
	System.out.println("N�meros pares: "+par);
	System.out.println("N�meros �mpares: "+impar);

	}
}
