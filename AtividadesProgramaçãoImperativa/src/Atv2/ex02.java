package Atv2;

import java.util.Scanner;

/* Faça um programa que preencha um vetor com dez números reais, calcule e mostre a 
 * quantidade de números negativos e a soma dos números positivos desse vetor.
 */

public class ex02 {
	
	public static String positivoNegativo(int[] vetor) {
		
		int quantidadePositivo = 0;
		int quantidadeNegativo = 0;
		int somaPositivo = 0 ;
		int somaNegativo = 0;
		for(int contador = 0; contador < vetor.length; contador++) {
			
			if(vetor[contador] >= 0) {
				quantidadePositivo += 1;
				somaPositivo += vetor[contador];
				//System.out.print(vetor[contador] + " ");
			}
			else {
				quantidadeNegativo += 1;
				somaNegativo += vetor[contador];
				//System.out.print(vetor[contador] + " ");
			}
		} 
		
		System.out.print("\n-----------------------------------------------------------------------------------");
		String resultado = "\nA quantidade de valores positivos foi de " + quantidadePositivo + " e negativos de "
				+ quantidadeNegativo + ". E soma de positivos foi de " + somaPositivo + " e de negativos foi de " + somaNegativo;
		return resultado;
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] vetor = new int[10];
		
		for(int contador = 0; contador < vetor.length; contador++) {
			System.out.print("Digite o valor do vetor na posição " + (contador+1) + ": " + " ");
			vetor[contador] = entrada.nextInt();
		}
		
		System.out.println(positivoNegativo(vetor));
		
		entrada.close();
		}

}
