package com.joshua.cursojava;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
//		Fa�a um programa que mostre o primeiro n�mero divisivel por 7,
//		entre um n�mero e um limite.
		Scanner scan = new Scanner(System.in);
		int num, max;
		
		System.out.println("Entre com um n�mero");
		num = scan.nextInt();
		
		System.out.println("Entre com um limite");
		max = scan.nextInt();
		
		for(int i=num;i<max;i++){
			
			if(i % 7 == 0){
				System.out.println("O primeiro n�mero divis�vel por 7 encontrado foi: "+i);
				break;
			}
		}
	}
}
