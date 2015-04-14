package com.joshua.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
//		30) O Cardápio de uma lanchonete é o seguinte:
//			Especificação    Código  Preço
//			Cachorro Quente  100     R$ 1,20
//			Bauru Simples    101     R$ 1,30
//			Bauru com ovo    102     R$ 1,50
//			Hambúrguer       103     R$ 1,20
//			Cheeseburguer    104     R$ 1,30
//			Refrigerante     105     R$ 1,00
//		Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. 
//		Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral
//		do pedido. Considere que o cliente deve informar quando o pedido deve ser encerrado.
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.00");// ou ("0.00")
		int cod, qtd;
		double valor =0; 
		double soma = 0;
		String continuar = "";
		String output = "";
		boolean sair = true;
		
		do{
			do{
				System.out.println("Digite o código.");
				cod = scan.nextInt();
				
				if(cod<100 || cod >105){
					sair = false;
				   System.out.println("Código inválido, tente novamente");
				}else{
					sair = true;
				}
			}while(!sair);
			
			System.out.println("Digite a quantidade.");
			qtd = scan.nextInt();
			
			if(cod == 100){
				valor = qtd*1.20;
				output +=""+qtd+"   Cachorro Quente  100     R$ 1,20 -"+" R$ "+df.format(valor)+"\n";

			}else if(cod == 101){
				valor = qtd*1.30;
				output += ""+qtd+"   Bauru Simples    101     R$ 1,30 -"+" R$ "+df.format(valor)+"\n";
				
			}else if(cod == 102){
				valor = qtd*1.50;
				output += ""+qtd+"   Bauru com ovo    102     R$ 1,50 -"+" R$ "+df.format(valor)+"\n";
				
			}else if(cod == 103){
				valor = qtd*1.20;
				output += ""+qtd+"   Hambúrguer       103     R$ 1,20 -"+" R$ "+df.format(valor)+"\n";
				
			}else if(cod == 104){
				valor = qtd*1.30;
				output += ""+qtd+"   Cheeseburguer    104     R$ 1,30 -"+" R$ "+df.format(valor)+"\n";
				
			}else if(cod == 105){
				valor = qtd*1.00;
				output += ""+qtd+"   Refrigerante     105     R$ 1,00 -"+" R$ "+df.format(valor)+"\n";
				
			}
			soma+=valor;
			
			System.out.println("Deseja continuar? S/N");
			continuar = scan.next();
			
			if(continuar.equalsIgnoreCase("n")){
				sair = true;
			}else if(continuar.equalsIgnoreCase("s")){
				sair = false;
			}
		}while(!sair);
			
			System.out.println("QTD Especificação    Código  Preço");
			System.out.println(output);
			System.out.println("O valor dos produtos: R$ "+df.format(soma));
	}

}
