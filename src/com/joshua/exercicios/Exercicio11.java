package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		//11
		/* Altere o programa anterior para mostrar no final a soma dos n�meros. */
		Scanner scan = new Scanner(System.in);
		
		int num1, num2; 
		int soma = 0;
		
		System.out.println("Digite um n�mero inteiro");
		num1 = scan.nextInt();
		
		System.out.println("Digite um n�mero inteiro maior que: "+num1);
		num2 = scan.nextInt();
		
		for(int i = num1;i <= num2;i++){
			soma += i;
		}
		System.out.println("A soma dos n�meros entre "+num1+" e "+num2+" �: "+soma);
	}
}
