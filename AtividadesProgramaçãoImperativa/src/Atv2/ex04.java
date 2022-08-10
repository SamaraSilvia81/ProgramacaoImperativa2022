package Atv2;

import java.util.Arrays;
import java.util.Random;

/*Faça um programa que defina dois vetores do tipo inteiro, um chamado par e outro 
 * chamado ímpar. Cada vetor deve conter 10 elementos. A seguir, faça um laço de repetição
 * com 10 iterações e que contenha internamente a geração randômica de números entre 1 e 20. 
 * Se o valor gerado for par, armazene no vetor chamado par, caso contrário, no vetor chamado ímpar. 
 * Ao final, apresente o conteúdo de cada um dos vetores. 
 * Dica: Utilize o método nextInt(int n) da classe java.util.Random
 */

public class ex04 {
	
public static void parImpar() {
		
		Random aleatorio = new Random();
		
		int[] vetorPar = new int[10];
		int[] vetorImpar = new int[10];
		
		int quantidadePar = 0;
		int quantidadeImpar = 0;
		
		System.out.print("Os valores aleatórios são:");
		
		while(true) {
			
			int valorRandomico = aleatorio.nextInt(20)+1;
			System.out.print(" " + valorRandomico);
			
			if(valorRandomico % 2 == 0 && quantidadePar < 10) {
				vetorPar[quantidadePar] = valorRandomico;
				quantidadePar += 1;
			}
			if(valorRandomico % 2 == 1 && quantidadeImpar < 10) {
				vetorImpar[quantidadeImpar] = valorRandomico;
				quantidadeImpar += 1;
			}
			if(quantidadeImpar == 10 && quantidadePar == 10) {
				break;
			}
		}
		
        System.out.print("\n\nQuantos pares têm?" + " " + quantidadePar);
        System.out.print("\nOs números pares são:" + " " + Arrays.toString(vetorPar));
        System.out.print("\n---------------------------------------------------------");
        System.out.print("\nQuantos impares têm?" + " " + quantidadeImpar);
        System.out.print("\nOs números impares são:" + " " + Arrays.toString(vetorImpar));
     }


	public static void main(String[] args) {
		
		parImpar();

	}

}
