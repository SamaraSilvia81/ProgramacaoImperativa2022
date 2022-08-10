package Atv2;

import java.util.Arrays;
import java.util.Random;

/*Fa�a um programa que defina dois vetores do tipo inteiro, um chamado par e outro 
 * chamado �mpar. Cada vetor deve conter 10 elementos. A seguir, fa�a um la�o de repeti��o
 * com 10 itera��es e que contenha internamente a gera��o rand�mica de n�meros entre 1 e 20. 
 * Se o valor gerado for par, armazene no vetor chamado par, caso contr�rio, no vetor chamado �mpar. 
 * Ao final, apresente o conte�do de cada um dos vetores. 
 * Dica: Utilize o m�todo nextInt(int n) da classe java.util.Random
 */

public class ex04 {
	
public static void parImpar() {
		
		Random aleatorio = new Random();
		
		int[] vetorPar = new int[10];
		int[] vetorImpar = new int[10];
		
		int quantidadePar = 0;
		int quantidadeImpar = 0;
		
		System.out.print("Os valores aleat�rios s�o:");
		
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
		
        System.out.print("\n\nQuantos pares t�m?" + " " + quantidadePar);
        System.out.print("\nOs n�meros pares s�o:" + " " + Arrays.toString(vetorPar));
        System.out.print("\n---------------------------------------------------------");
        System.out.print("\nQuantos impares t�m?" + " " + quantidadeImpar);
        System.out.print("\nOs n�meros impares s�o:" + " " + Arrays.toString(vetorImpar));
     }


	public static void main(String[] args) {
		
		parImpar();

	}

}
