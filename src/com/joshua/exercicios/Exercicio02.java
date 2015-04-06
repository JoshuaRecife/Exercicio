package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//02
		/* Faça um programa que leia um nome de usuário e a senha
		 * e não aceite a senha igual ao nome de usuário, mostrando
		 * mensagem de erro e voltando a pedir as informações.*/ 
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		String senha;
		boolean condValida;
		
		System.out.println("Digite seu nome.");
		nome = scan.next();
	
		do{
			System.out.println("Digite uma senha, não pode digitar seu nome.");
			senha = scan.next();
			
			if(senha.equalsIgnoreCase(nome)){
				condValida = false;
				System.out.println("Senha inválida, digite uma senha diferente do seu nome.");
				
			}else{
				condValida = true;
				System.out.println("Senha válida");
			}
		}while(!condValida);
		
		
	}

}
