package com.joshua.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
//		30) Depois de ter concluido o Exerc�cio anterior, altere o programa permitindo 
//			que o usu�rio digite o sal�rio inicial do funcion�rio.
			Scanner scan = new Scanner(System.in);
			DecimalFormat df = new DecimalFormat("###,###.##"); //Se n�o pegar � s� trocar a virgula por ponto e ponto por virgula
			double salario;
			double percentual = 1.5; //96
			
			System.out.println("Digite o sal�rio do funcion�rio");
			salario = scan.nextDouble();
			
			System.out.println("1995 R$ "+salario+" - 0%");
			
			salario += (salario/100) * percentual; //
			
			System.out.println("1996 R$ "+df.format(salario)+" - "+df.format(percentual)+"%");

			for(int i=1997;i<=2015;i++){
				percentual*=2;
				salario += (salario/100) * percentual;
				System.out.println(+i+" R$ "+df.format(salario)+" - "+df.format(percentual)+"%");
			}

	}

}
