package com.joshua.cursojava.arrays;

public class ExercicioArrays21 {

	public static void main(String[] args) {
//	21) Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
//		0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
//		para implementar um programa que determine o percentual de
//		números 0's e 1's existentes no vetor A.
		int[] vetorA = new int[10];
		int um = 0;
		int zero = 0;
		
		for(int i=0;i<vetorA.length;i++){
			vetorA[i] = (int) Math.round(Math.random() * 1);
			
			if(vetorA[i] == 1){
				um++;
			}else{
				zero++;
			}
		}
			System.out.print("Vetor A: ");
		for(int vetoresA : vetorA){
			System.out.print(vetoresA+" ");
		}
			System.out.println();
			System.out.println(((um*100)/vetorA.length)+"% é de do número 1");
			System.out.println(((zero*100)/vetorA.length)+"% é do número 0");
	}
}
