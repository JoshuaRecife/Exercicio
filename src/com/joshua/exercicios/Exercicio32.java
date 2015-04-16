package com.joshua.exercicios;

public class Exercicio32 {

	public static void main(String[] args) {
//	32) Faça um programa que mostre os n termos da Série a seguir e 
//		imprima no final a soma da Série.
//		Terá que aparecer na tela essa formatação:
//		s = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + 6/11 + 7/13 + 8/15 + 9/17.
//		A soma do i é = 45
//		A soma do j é = 81
		int somaI = 0;
		int somaJ = 0;
		System.out.print("s = ");
		for(int i=1, j=1;i<=9;i++, j+=2){
			somaI+= i;
			somaJ+= j;
			System.out.print(i+"/"+j);
		if(i < 9){
			System.out.print(" + ");
		}else{
			System.out.println(".");
		}
			
		}
		System.out.println("s = "+somaI+"/"+somaJ);
	}

}
