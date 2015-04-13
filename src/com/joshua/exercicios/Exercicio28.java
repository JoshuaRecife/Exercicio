package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
//		28) Desenvolva um programa que faça a tabuada de um número qualquer inteiro
//		que será digitado pelo usuário, mas a tabuada não deve necessariamente iniciar
//		em 1 e terminar em 10, o valor inicial e final deve ser informados também pelo
//		usuário, conforme exemplo abaixo:
//		Montar a tabuada de: 5 
//		Começar por: 4
//		Terminar em: 7
//		Vou montar a tabuada de 5 começando em 4 e terminando em 7:
		
//		5 x 4 = 20 
//		5 x 5 = 25
//		5 x 6 = 30
//		5 x 7 = 35
//		Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.
		Scanner scan = new Scanner(System.in);
		int num1, num2,num3;
		
		System.out.print("Montar a tabuada de: ");
		num1 = scan.nextInt();
		
		System.out.print("Começar por: ");
		num2 = scan.nextInt();
	
		do{
			System.out.print("Terminar em: ");
			num3 = scan.nextInt();
			
			if(num3 <= num2){
				System.out.println("Digite um número maior que: "+num2);
			}
		}while(num3 <= num2);
		
		System.out.println(" ");
		System.out.println("Tabuada de "+num1+" começando por "+num2+" e terminando em "+num3+":");
		
		for(int i=num2;i<=num3;i++){
			System.out.println(+num1+" x "+i+" = "+(num1*i));
		}
	}
}
