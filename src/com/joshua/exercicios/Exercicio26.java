package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
//		26) O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa
//		que leia um conjunto indeterminado de temperaturas e informe ao final a menor e a maior 
//		temperatura informada bem como a média das temperaturas.
		Scanner scan = new Scanner(System.in);
		double num, media;
		double soma = 0;
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		int cont = 1;
		System.out.println("Departamento Estadual de Metereologia");
//		O exercício proposto diz: ...desenvolver um programa que leia um conjunto indeterminado...
//		Eu entendo que 'indeterminado' você não terá que especificar quantas temperaturas irá
//		digitar, mas vai de interpretação, tem professores e programadores que irá colocar um campo
//		perguntando ao usuário quantas temperaturas ele irá digitar. Esta é a forma mais simples que eu
//		entendo que dá para fazer sem perguntar quantas temperaturas irão digitar. Obs: Sou iniciante!
		do{
			System.out.println("Digite a "+(cont++)+"º temperatura e para sair digite o código '3333'");
			num = scan.nextDouble();
			
			if(num == 3333){
				break;
			}else if(num > maior){
					maior = num;
				}else if(num < menor){
					menor = num;
				}
			soma += num;
		}while(num != 3333);
			media = soma / (cont-2);
			System.out.println("A maior temperatura foi: "+maior+" graus");
			System.out.println("A menor temperatura foi: "+menor+" graus");
			System.out.println("A média das temperaturas foi de: "+media+" graus");
			
	}

}
