package com.joshua.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		//19 Fa�a um programa que calcule e mostre a m�dia aritm�tica de N notas.
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double soma = 0;
		int  qtdNotas;
		double media,nota;
		
		System.out.println("Digite a quantidade de notas para o c�lculo da m�dia");
		qtdNotas = scan.nextInt();
		
		for(int i = 0;i < qtdNotas;i++){
			System.out.println("Entre com a "+(i+1)+"� nota.");
			nota = scan.nextDouble();
			soma += nota;
		}
		media = soma/qtdNotas;
		System.out.println("A m�dia �: "+df.format(media));

	}

}
