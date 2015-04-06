package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//05 
		/*Altere o programa anterior permitindo ao usuário 
		  informar as populaçoes e  as taxas de crescimento iniciais.
		  Valide a entrada e permita repetir a operação.  */
		Scanner scan = new Scanner(System.in);
		
		int popA, popB;
		int cont = 0;
		double txA, txB;
		String resp;
		boolean condValida = false;
		
		do{
			System.out.println("Digite a população do país 'A'. tem que ser menor do que a do país 'B'.");
			popA = scan.nextInt();
			
			System.out.println("Digite a taxa de crescimento do país 'A'");
			txA = scan.nextDouble();
				do{
					System.out.println("Digite a população do país 'B'");
					popB = scan.nextInt();
					if(popB < popA){
						condValida = false;
						System.out.println("Você digitou um valor inferior ao do país A, tente novamente.");
				}else{
					condValida = true;
				}
				}while(!condValida);
			
			System.out.println("Digite a taxa de crescimento do país 'B'");
			txB = scan.nextDouble();
				while(popA <= popB){
					  popA += (popA/100)*3;
					  popB += (popB/100)*1.5;
					  cont++;
				}
			System.out.println("População A: "+popA);
			System.out.println("População B: "+popB);
			System.out.println("Quantidade de anos: "+cont);
			
			System.out.println("Você deseja fazer outra consulta? Digite S (sim) ou N (não)");
			resp = scan.next();
			if(resp.equalsIgnoreCase("n")){
				condValida = true;
				
			}else if(resp.equalsIgnoreCase("s")){
				condValida = false;
			}
		}while(!condValida);
	}
}
