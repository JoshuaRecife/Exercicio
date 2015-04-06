package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//03
		/* Faça um programa que leia e valide as seguintes informações:
		 * a. Nome: maior que 3 caracteres;
		 * b. Idade: entre 0 e 150;
		 * c. Salário: maior que zero;
		 * d. Sexo: 'f' ou 'm';
		 * e. Estado Civil: 's', 'c', 'v', 'd'; */
		
		Scanner scan = new Scanner(System.in);
		
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		boolean condvalida; //por padrão é false
		
		do{		
			System.out.println("Digite seu nome.");
			nome = scan.nextLine();
			
			if(nome.length() <=3){
				condvalida = false;
				System.out.println("Digite um nome maior que 3 caracteres.");
			}else{
				condvalida = true;
			}
		}while(!condvalida);
		
		do{	
			System.out.println("Digite sua idade.");
			idade = scan.nextInt();
			
			if(idade <= 0 || idade > 150){
				condvalida = false;
				System.out.println("Digite uma idade entre 0 e 150.");
			}else{
				condvalida = true;
			}
		}while(!condvalida);
		
		do{	
			System.out.println("Digite seu salário.");
			salario = scan.nextDouble();
			
			if(salario <= 0){
				condvalida = false;
				System.out.println("Digite um valor para salário, maior que zero(0).");
			}else{
				condvalida = true;
			}
		}while(!condvalida);
		
		do{
			System.out.println("Digite seu sexo 'F' ou 'M'.");
			sexo = scan.next();
			
			if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
				condvalida = true;
			}else{
				condvalida = false;
				System.out.println("Digite um 'F' para Feminino e 'M' para masculino");
			}
		}while(!condvalida);
			
		do{	
			System.out.println("Digite seu Estado Civil: 's', 'c', 'v' ou 'd'.");
			estadoCivil = scan.next();
			
			if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") ||
					estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
				condvalida = true;
			}else{
				condvalida = false;
				System.out.println("Digite 's' ou 'c' ou 'v' ou 'd'");
			}
		
		}while(!condvalida);
		
		System.out.println("Dados Ok!");
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Salário: "+salario);
		System.out.println("Sexo: "+sexo);
		System.out.println("Estado Civil: "+estadoCivil);
		
		
		
	}

}
