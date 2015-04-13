package com.joshua.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
//		30) Depois de ter concluido o Exercício anterior, altere o programa permitindo 
//			que o usuário digite o salário inicial do funcionário.
			Scanner scan = new Scanner(System.in);
			DecimalFormat df = new DecimalFormat("###,###.##"); //Se não pegar é só trocar a virgula por ponto e ponto por virgula
			double salario;
			double percentual = 1.5; //96
			
			System.out.println("Digite o salário do funcionário");
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
