package com.joshua.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//05 
		/*Altere o programa anterior permitindo ao usu�rio 
		  informar as popula�oes e  as taxas de crescimento iniciais.
		  Valide a entrada e permita repetir a opera��o.  */
		Scanner scan = new Scanner(System.in);
		
		int popA, popB;
		int cont = 0;
		double txA, txB;
		String resp;
		boolean condValida = false;
		
		do{
			System.out.println("Digite a popula��o do pa�s 'A'. tem que ser menor do que a do pa�s 'B'.");
			popA = scan.nextInt();
			
			System.out.println("Digite a taxa de crescimento do pa�s 'A'");
			txA = scan.nextDouble();
				do{
					System.out.println("Digite a popula��o do pa�s 'B'");
					popB = scan.nextInt();
					if(popB < popA){
						condValida = false;
						System.out.println("Voc� digitou um valor inferior ao do pa�s A, tente novamente.");
				}else{
					condValida = true;
				}
				}while(!condValida);
			
			System.out.println("Digite a taxa de crescimento do pa�s 'B'");
			txB = scan.nextDouble();
				while(popA <= popB){
					  popA += (popA/100)*3;
					  popB += (popB/100)*1.5;
					  cont++;
				}
			System.out.println("Popula��o A: "+popA);
			System.out.println("Popula��o B: "+popB);
			System.out.println("Quantidade de anos: "+cont);
			
			System.out.println("Voc� deseja fazer outra consulta? Digite S (sim) ou N (n�o)");
			resp = scan.next();
			if(resp.equalsIgnoreCase("n")){
				condValida = true;
				
			}else if(resp.equalsIgnoreCase("s")){
				condValida = false;
			}
		}while(!condValida);
	}
}
