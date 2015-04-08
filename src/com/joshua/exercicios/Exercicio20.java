package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
//		20) Fa�a um programa que pe�a para n pessoas a sua idade, ao final
//		o programa devera verificar se a m�dia de idade da turma varia entre 12 a 20, 21 at� 59
//		e a partir de 60 em diante; e ent�o, dizer se a turma � jovem, adulta ou idosa, conforme a m�dia calculada.
		Scanner scan = new Scanner(System.in);
		int qtdPessoas;
		int idade;
		double soma = 0;
		double media;
		
		System.out.println("Quantas pessoas (na turma) vai digitar a idade?");
		qtdPessoas = scan.nextInt();
		
		for(int i = 0;i < qtdPessoas;i++){
			System.out.println("Digite a "+(i+1)+"� idade?");
			idade = scan.nextInt();
			soma += idade;
		}
		media = soma / qtdPessoas;
		
		System.out.println("A m�dia de idade da turma: "+media);
		if(media >= 12 && media <= 20){
			System.out.println("Turma Jovem");
		}else if(media >= 21 && media <= 59){
			System.out.println("Turma Adulta");
		}else if(media >= 60){
			System.out.println("Turma Idosa");
		}
	}
}
