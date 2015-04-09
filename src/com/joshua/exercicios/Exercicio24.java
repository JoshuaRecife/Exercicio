package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
//		24) O Sr. Manuel Joaquim acaba de adquirir uma panificadora e prentende implantar
//		a metodologia da tabelinha, que já é um sucesso na sua loja de 1,99. Você foi
//		contratado para desenvolver o programa que monta a tabela de preços de pães de 1 até 50,
//		a partir do preço do pão informado pelo usuário, conforme o exemplo abaixo:
//		Preço do pão: R$ 0.18
//		Panificadora Pão de otem - Tabela de preços
//		1 - R$ 0.18
//		2 - R$ 0.36
//		...
//		50 - R$ 9.00
		Scanner scan = new Scanner(System.in);
		double preco;
		
		System.out.println("Insira o preço do Pão");
		preco = scan.nextDouble();
		
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		for(int i = 1;i<=50;i++){
			System.out.println(+i+" - R$ "+(i*preco));
		}
	}
}
