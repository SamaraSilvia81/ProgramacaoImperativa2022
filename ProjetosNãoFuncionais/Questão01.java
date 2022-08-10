package Atv002;

import java.util.Arrays;
import java.util.Scanner;

/* Faça um programa que leia um vetor com quinze posições para números inteiros. Crie, a
 * seguir, um vetor resultante que contenha todos os números primos do vetor digitado. 
 * Escreva o vetor resultante.
 */

public class Questão01 {
	
		static int[] primos(int[] vetor) {
				
			int tamanhoArray = 0;
			for(int contador = 0; contador < vetor.length; contador++) {
					
				int tamanhoDivisaoArray = 0;
				for(int divisor = 1; divisor <= vetor[contador]; divisor++) {
					if(vetor[contador] % divisor == 0) {
						tamanhoDivisaoArray += 1;		
						}		
					}
				
				if(tamanhoDivisaoArray == 2) {
					tamanhoArray += 1;
					}	
				}
			
			int[] vetorPrimo = new int[tamanhoArray];
			int tamanhoVetorPrimo = 0;
			for(int contador = 0; contador < vetor.length; contador++) {
				
				int tamanhoDivisao = 0;
				for(int divisor = 1; divisor <= vetor[contador]; divisor++) {
					
					if(vetor[contador] % divisor == 0) {
						tamanhoDivisao += 1;
						}
					}
				
				if(tamanhoDivisao == 2) {
					vetorPrimo[tamanhoVetorPrimo] = vetor[contador];
					tamanhoVetorPrimo += 1;
					}
				}
			
			return vetorPrimo;
		}

			public static void main(String[] args) {
				
				Scanner entrada = new Scanner(System.in);
				int vetorA[] = new int[5];
				
				for(int contador = 0; contador < vetorA.length; contador++) {
					System.out.print("Digite o valor do vetor na posição " + (contador + 1) + " : " + " ");
					vetorA[contador] = entrada.nextInt();
				}
				
				System.out.println(Arrays.toString(primos(vetorA)));
				
				entrada.close();
			}
		}
		
