package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//02
		/* Fa�a um programa que leia um nome de usu�rio e a senha
		 * e n�o aceite a senha igual ao nome de usu�rio, mostrando
		 * mensagem de erro e voltando a pedir as informa��es.*/ 
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		String senha;
		boolean condValida;
		
		System.out.println("Digite seu nome.");
		nome = scan.next();
	
		do{
			System.out.println("Digite uma senha, n�o pode digitar seu nome.");
			senha = scan.next();
			
			if(senha.equalsIgnoreCase(nome)){
				condValida = false;
				System.out.println("Senha inv�lida, digite uma senha diferente do seu nome.");
				
			}else{
				condValida = true;
				System.out.println("Senha v�lida");
			}
		}while(!condValida);
		
		
	}

}
