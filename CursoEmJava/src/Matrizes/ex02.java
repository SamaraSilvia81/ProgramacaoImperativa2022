package Matrizes;

import java.util.Random;
import java.util.Scanner;

public class ex02 {
	
	/* Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0--9.
	 * Após isso determine o maior e menor vlaor da linha 5 e maior e menor valor da coluna 7.
	 */
	
	public static void main(String[] args) {
		
Scanner leitor = new Scanner (System.in);
		
		int [][] vet = new int [10][10];
		int maior = 0, maior2 = 0, menor = 0, menor2 = 0;
		
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
				if(vet[4][c]>maior) {
					maior = vet[4][c];
				} else if(vet[l][4]<menor) {
					menor = vet[l][4];
				} if(vet[6][c]>maior) {
					maior2 = vet[6][c];
				} else if(vet[l][6]<menor) {
					menor2 = vet[l][6];
			}
		}
		}
		
		System.out.print("\nMaior valor da linha 5 é: " +maior);
		System.out.print("\nMenor valor da linha 5 é: " +menor);
		System.out.println(" ");
		System.out.print("\nMaior valor da linha 7 é: " +maior2);
		System.out.print("\nMenor valor da linha 7 é: " +menor2);
			
	}
}
