package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//01
		/* Fa�a um programa que pe�a uma nota, entre zero e dez.
		 * Mostre uma mensagem caso o valor seja inv�lido e continue 
		 * pedindo at� que o usu�rio informe um valor v�lido. */
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		boolean condValida;  //por padr�o o atributo booleano � falso
		
		do{
		System.out.println("Digite um valor entre 0 (zero) e 10 (dez)");
		num = scan.nextInt();
		
		if(num < 0 || num > 10){
			condValida = false;
			System.out.println("Valor digitado inv�lido: "+num +", digite um valor entre 0 e 10.");
			
		}else{
			condValida = true;
			System.out.println("Valor aceito: "+num);
		}
		
		}while(!condValida);
		
		
	}

}
