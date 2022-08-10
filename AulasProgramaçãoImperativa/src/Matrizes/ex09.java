package Matrizes;

import java.util.Scanner;

public class ex09 {
	

	/* Escreva um programa que retorne as somas dos elementos de cada linha e de cada coluna 
	 * de uma matriz 3 × 4 com números inteiros.
	 */
	
	static void exibir (int [][] matriz) {
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Digite 12 valores: ");
		for(int l = 0; l<matriz.length; l++) {
			for(int c = 0; c<matriz[l].length;c++) {
				matriz [l][c] = leitor.nextInt();
			}
		}
		
		System.out.print("\n");
		System.out.print("A matriz é: \n");
		for(int l = 0; l<matriz.length; l++) {
			for(int c = 0; c<matriz[l].length;c++) {
				System.out.print(matriz[l][c] + " ");
				
			}
			
			System.out.println(" ");  
			
		}	
		
	}

	
	static void somar (int [][] matriz) {
		
		System.out.print("\n");
		System.out.print("A soma das linhas é: ");
		for(int l = 0; l<matriz.length; l++) {
			int resultado = 0;
			for(int c = 0; c<matriz[l].length;c++) {
				resultado += matriz[l][c];
			}
			
			System.out.print(resultado + " ");
		}	
		
		System.out.print("\n");
		
		System.out.print("A soma das colunas é: ");
		
		for(int c = 0; c<4; c++) {
			int resultado = 0;
			for(int l = 0; l<3;l++) {
				resultado += matriz[l][c];
			}
			
			System.out.print(resultado + " ");
		}	

	}
	
	public static void main(String[] args) {
		
		int [][] matriz = new int [3][4];
		
		exibir(matriz);
		somar(matriz);
		
	
		// entrada de valores - 1 2 3 4 5 6 7 8 9 10 11 12
		
		
		
		
	}

}
