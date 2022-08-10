package Matrizes;

import java.util.Scanner;

public class ex04 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int [][] valor = new int [3][3];
		int [][] valor2 = new int [3][3];
		int temp = 0, temp2 = 0, l1 = 0, l2 = 2, c1 = 0, c2 = 2;
		
		System.out.print("Digite 9 valores: ");
		
		for(int l = 0; l<3; l++) {
			for(int c = 0; c<3;c++) {
				valor [l][c] = leitor.nextInt();
			}
		}
		
		System.out.print("----------------------------------\n");
		System.out.print("A matriz formada é: \n");
		
		for(int l = 0; l<3; l++) {
			for(int c = 0; c<3;c++) {
				System.out.print(valor[l][c] + " ");
			}
			
			System.out.println(" "); 
		}
		
		for(int i = 0; i<3;i++) {
			
			temp = valor[l1][i];
			valor[l1][i] = valor[l2][i];
			valor[l2][i] = temp;
		} 
		
		System.out.print("\nA nova matriz é (mudança de linha): " + "\n");
		
		for(int l = 0; l<3; l++) {
			for(int c = 0; c<3;c++) {
				System.out.print(valor[l][c] + " ");
				}
			
			System.out.println(" "); 
			}
		
		// Isso é feito para que a troca das colunas não seja junto com a troca das linhas.
		
		System.out.println(" ");
		System.out.print("Digite mais 9 valores: ");
		
		for(int l = 0; l<3; l++) {
			for(int c = 0; c<3;c++) {
				valor2 [l][c] = leitor.nextInt();
			}
		} for(int i = 0; i<3;i++) {
			
			temp2 = valor2[i][c1];
			valor2[i][c1] = valor2[i][c2];
			valor2[i][c2] = temp2;
		} 

		System.out.print("----------------------");
		System.out.print("\nA nova matriz é (mudança de coluna): " + "\n");
		
		for(int l = 0; l<3; l++) {
			for(int c = 0; c<3;c++) {
				System.out.print(valor2[l][c] + " ");
				}
			
			System.out.println(" "); 
			}
		
		// Entrada de valores - 1 2 3 4 5 6 7 8 9

	}

}
