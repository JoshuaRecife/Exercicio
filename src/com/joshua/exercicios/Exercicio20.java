package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
//		20) Faça um programa que peça para n pessoas a sua idade, ao final
//		o programa devera verificar se a média de idade da turma varia entre 12 a 20, 21 até 59
//		e a partir de 60 em diante; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
		Scanner scan = new Scanner(System.in);
		int qtdPessoas;
		int idade;
		double soma = 0;
		double media;
		
		System.out.println("Quantas pessoas (na turma) vai digitar a idade?");
		qtdPessoas = scan.nextInt();
		
		for(int i = 0;i < qtdPessoas;i++){
			System.out.println("Digite a "+(i+1)+"º idade?");
			idade = scan.nextInt();
			soma += idade;
		}
		media = soma / qtdPessoas;
		
		System.out.println("A média de idade da turma: "+media);
		if(media >= 12 && media <= 20){
			System.out.println("Turma Jovem");
		}else if(media >= 21 && media <= 59){
			System.out.println("Turma Adulta");
		}else if(media >= 60){
			System.out.println("Turma Idosa");
		}
	}
}
