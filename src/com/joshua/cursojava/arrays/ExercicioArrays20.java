package com.joshua.cursojava.arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioArrays20 {

	public static void main(String[] args) {
//	20. Implementar um programa que obtenha a cotação do dólar (U$) em
//		relação ao real (R$) e a seguir armazene em vetor A com 20
//		elementos as seguintes conversões:
//	    A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.##");
		double[] vetorA = new double[20];
		double dolar;
		
			System.out.println("Digite a cotação do dolar hoje.");
			dolar = scan.nextDouble();
		for(int i=0;i<vetorA.length;i++){
			vetorA[i] = dolar*(i+1);
		}
		for(int i=0;i<vetorA.length;i++){
			System.out.println("US$ "+(i+1)+" dolar vale R$ "+df.format(vetorA[i]));
		}
	}
}
