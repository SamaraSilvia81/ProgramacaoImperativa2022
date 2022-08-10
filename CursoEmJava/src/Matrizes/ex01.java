package Matrizes;

import java.util.Random;
import java.util.Scanner;

public class ex01 {
	
	/* Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0--9.
	 * Após isso determine o maior número da matriz e sua posição (linha,coluna).
	 */
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int [][] vet = new int [4][4];
		int maior = 0, linha = 0, coluna = 0;
		
		Random aleatorio = new Random();
					
		for(int l = 0; l<vet.length; l++) {  // Laço de preenchimento.
			for(int c = 0; c<vet[l].length;c++) {
				 vet[l][c]= aleatorio.nextInt(9);
			}	
		}
		
		System.out.print("A matriz formada é: " + "\n");
		
		for(int l = 0; l<vet.length; l++) { // Laço de exibição.
			for(int c = 0; c<vet[l].length;c++) {
				System.out.print(vet[l][c] + " ");
			}
			
			System.out.println(" ");
		}
		
		for(int l = 0; l<vet.length; l++) { // Laço de varredura para achar o maior n°.
			for(int c = 0; c<vet[l].length;c++) {
				if(vet[l][c]>maior) {
					maior = vet[l][c];
					linha = l;
					coluna = c;
				} 
			}
		}
		
		System.out.print("\nMaior valor é: " +maior);
		System.out.print("\nNa linha: " +linha);
		System.out.print("\nNa coluna: " +coluna);
	
	}
}
