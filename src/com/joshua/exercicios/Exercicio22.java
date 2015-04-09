package com.joshua.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
	//22) Fa�a um programa que calcule o valor total investido por um colecionar
//		  em sua cole��o de CDs e o valor m�dio gasto em cada um deles. O usu�rio
//		  dever� informar a quantidade de CDs e o valor para cada um.
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double media, preco;
		double soma=0;
		int qtdCd;
		
		System.out.println("Digite quantos CDs tem na sua cole��o para calcular a m�dia dos gastos.");
		qtdCd = scan.nextInt();
		
		for(int i = 1;i <= qtdCd;i++){
		System.out.println("Informe o pre�o do Cd: "+i);
		preco = scan.nextDouble();
		soma += preco;
		}
		media = soma/qtdCd;
		
		System.out.println("Voc� tem "+qtdCd+" Cds");
		System.out.println("A m�dia de gasto com cada CD: R$ "+df.format(media));
	}
}
