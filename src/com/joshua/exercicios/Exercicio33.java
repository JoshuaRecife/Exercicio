package com.joshua.exercicios;

public class Exercicio33 {

	public static void main(String[] args) {
//		Sendo H = 1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 + 1/7 + 1/8 + 1/9 Faça um programa
//		que calcule o valor de H com N termos e mostre assim: A soma de 'H' é = 9
		int soma=1;
		System.out.print("H = ");
		System.out.print("1");
		for(int i=1, j=2;j<10;j++){
			soma+=i;
			System.out.print(" + ");
			System.out.print(i+"/"+j);
		}
		System.out.println("");
		System.out.print("A soma de 'H' é = "+(soma));

	}

}
