package Atv002;

import java.util.Arrays;
import java.util.Scanner;

/* Crie um programa que defina um vetor com 10 elementos inteiros. Crie uma função para 
 * encontrar um determinado valor positivo e o substitua pelo seu negativo.
 */

public class Questão03 {
	
	public static int[] negativo(int[]vetor) {
		
		int[] vetorNegativo = new int[10];
		
		for(int contador = 0; contador < vetor.length; contador++) {
			
			if(vetor[contador] > 0) {
				vetorNegativo[contador] = vetor[contador] * (-1);
			}
			else {
				vetorNegativo[contador] = vetor[contador];
			}
		}
		return vetorNegativo;
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[10];
		
		for(int contador = 0; contador < vetor.length; contador++) {
			System.out.print("Digite o valor para o vetor na posição " + (contador+1) + ": " + " ");
			vetor[contador] = entrada.nextInt();
		}
		
		System.out.print("\n-----------------------------------------------------------");
		System.out.println("\nOs números negativos são: " +Arrays.toString(negativo(vetor)));
		
		entrada.close();
	}
}