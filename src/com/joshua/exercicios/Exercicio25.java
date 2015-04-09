package com.joshua.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
//		25) O Sr Manuel Joaquim expandiu seus negócios para além dos negócios de 1,99
//		e agora possui uma loja de conveniências. Faça um programa que implemente
//		uma caixa registradora rundimentar. O programa deverá receber um número
//		desconhecido de valores referentes aos preços das mercadorias. Um valor zero
//		deve ser informado pelo operador para indicar o final da compra. O programa deve
//		então mostrar o total da compra e perguntar o valor em dinheiro que o cliente
//		forneceu, para então calcular e mostrar o valor do troco. Após esta operação,
//		o programa deverá voltar ao ponto inicial, para registrar a próxima compra.
//		A saída de ver conforme o exemplo abaixo:
//      Lojas Tabajara
//		Produto 1: R$ 2.20
//		Produto 2: R$ 5.80
//		Produto 3: R$ 0
//		Total: R$ 8,00
//		Dinheiro: R$ 20.00
//		Troco: R$ 12.00
//		...
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		String resposta;
		double preco, dinheiro, troco;
		double total = 0;
		String output = "";
		int cont = 1;
		boolean condVerdadeira = false;
		boolean sair = false;
		do{	
			System.out.println("Lojas Tabajaras nova compra");
			do{
				
				System.out.println("Digite o preço do produto "+(cont)+". Para sair digite '0'(zero)");
				preco = scan.nextDouble();
				
				output += "Produto "+(cont++)+": R$ "+preco+"\n";
				total += preco;
			
			}while(preco != 0);
			
				System.out.println("total desta compra: R$ "+df.format(total));
			
			do{
				System.out.println("Quanto o cliente vai pagar?");
				dinheiro = scan.nextDouble();
					if(dinheiro < total){
						condVerdadeira = false;
						System.out.println("Valor informado incorreto, menor que: R$ "+df.format(total));
					}else{
						condVerdadeira = true;
					}
			}while(!condVerdadeira);
			
			troco = dinheiro - total;
			
			System.out.println("Lojas Tabajara");
			System.out.println(output);
			System.out.println("Total: R$ "+df.format(total));
			System.out.println("Dinheiro: R$ "+dinheiro);
			System.out.println("Troco: R$ "+df.format(troco));
			
				System.out.println("Deseja informar uma nova compra? S/N");
				resposta = scan.next();
				
				if(resposta.equalsIgnoreCase("s")){
					 sair = false;
					 total = 0;
					 output = "";
					 cont = 1;
				}else if(resposta.equalsIgnoreCase("n")){
					sair = true;
				}
		}while(!sair);
		
	}
}
