package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
//		24) O Sr. Manuel Joaquim acaba de adquirir uma panificadora e prentende implantar
//		a metodologia da tabelinha, que j� � um sucesso na sua loja de 1,99. Voc� foi
//		contratado para desenvolver o programa que monta a tabela de pre�os de p�es de 1 at� 50,
//		a partir do pre�o do p�o informado pelo usu�rio, conforme o exemplo abaixo:
//		Pre�o do p�o: R$ 0.18
//		Panificadora P�o de otem - Tabela de pre�os
//		1 - R$ 0.18
//		2 - R$ 0.36
//		...
//		50 - R$ 9.00
		Scanner scan = new Scanner(System.in);
		double preco;
		
		System.out.println("Insira o pre�o do P�o");
		preco = scan.nextDouble();
		
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");
		for(int i = 1;i<=50;i++){
			System.out.println(+i+" - R$ "+(i*preco));
		}
	}
}
