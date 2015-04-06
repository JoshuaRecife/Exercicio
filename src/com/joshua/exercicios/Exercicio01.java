package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//01
		/* Faça um programa que peça uma nota, entre zero e dez.
		 * Mostre uma mensagem caso o valor seja inválido e continue 
		 * pedindo até que o usuário informe um valor válido. */
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		boolean condValida;  //por padrão o atributo booleano é falso
		
		do{
		System.out.println("Digite um valor entre 0 (zero) e 10 (dez)");
		num = scan.nextInt();
		
		if(num < 0 || num > 10){
			condValida = false;
			System.out.println("Valor digitado inválido: "+num +", digite um valor entre 0 e 10.");
			
		}else{
			condValida = true;
			System.out.println("Valor aceito: "+num);
		}
		
		}while(!condValida);
		
		
	}

}
