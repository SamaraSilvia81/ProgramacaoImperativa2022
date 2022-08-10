package Matrizes;

import java.util.Random;
import java.util.Scanner;

public class ex01 {
	
	/* Gere e imprima uma matriz M 4x4 com valores aleat�rios entre 0--9.
	 * Ap�s isso determine o maior n�mero da matriz e sua posi��o (linha,coluna).
	 */
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int [][] vet = new int [4][4];
		int maior = 0, linha = 0, coluna = 0;
		
		Random aleatorio = new Random();
					
		for(int l = 0; l<vet.length; l++) {  // La�o de preenchimento.
			for(int c = 0; c<vet[l].length;c++) {
				 vet[l][c]= aleatorio.nextInt(9);
			}	
		}
		
		System.out.print("A matriz formada �: " + "\n");
		
		for(int l = 0; l<vet.length; l++) { // La�o de exibi��o.
			for(int c = 0; c<vet[l].length;c++) {
				System.out.print(vet[l][c] + " ");
			}
			
			System.out.println(" ");
		}
		
		for(int l = 0; l<vet.length; l++) { // La�o de varredura para achar o maior n�.
			for(int c = 0; c<vet[l].length;c++) {
				if(vet[l][c]>maior) {
					maior = vet[l][c];
					linha = l;
					coluna = c;
				} 
			}
		}
		
		System.out.print("\nMaior valor �: " +maior);
		System.out.print("\nNa linha: " +linha);
		System.out.print("\nNa coluna: " +coluna);
	
	}
}
