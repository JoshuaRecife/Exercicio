package com.joshua.cursojava.arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioArrays20 {

	public static void main(String[] args) {
//	20. Implementar um programa que obtenha a cota��o do d�lar (U$) em
//		rela��o ao real (R$) e a seguir armazene em vetor A com 20
//		elementos as seguintes convers�es:
//	    A[i] = cota��o do dolar * i, para todo i variando de 1 at� 20.
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.##");
		double[] vetorA = new double[20];
		double dolar;
		
			System.out.println("Digite a cota��o do dolar hoje.");
			dolar = scan.nextDouble();
		for(int i=0;i<vetorA.length;i++){
			vetorA[i] = dolar*(i+1);
		}
		for(int i=0;i<vetorA.length;i++){
			System.out.println("US$ "+(i+1)+" dolar vale R$ "+df.format(vetorA[i]));
		}
	}
}
