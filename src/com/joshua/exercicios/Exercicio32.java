package com.joshua.exercicios;

public class Exercicio32 {

	public static void main(String[] args) {
//	32) Fa�a um programa que mostre os n termos da S�rie a seguir e 
//		imprima no final a soma da S�rie.
//		Ter� que aparecer na tela essa formata��o:
//		s = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + 6/11 + 7/13 + 8/15 + 9/17.
//		s = 45/81
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
