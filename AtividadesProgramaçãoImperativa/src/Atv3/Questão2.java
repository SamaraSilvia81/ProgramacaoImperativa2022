package Atv3;

import java.util.Scanner;

public class Questão2 {
	
	/* Elabore um programa que preencha uma matriz 10 × 10 com números inteiros, execute as 
	 * trocas especificadas a seguir e mostre a matriz resultante: 
	 * a. A linha 2 com a linha 8;
	 * b. A coluna 4 com a coluna 10;
	 * c. A diagonal principal com a diagonal secundária;
	 * d. A linha 5 com a coluna 10.
	 */
	
	static void mat1 (int [][] mat) {
		
		int temp = 0, l2 = 1, l8= 7;
		
		// Preenchimento automático
		
		for(int l = 0; l<10; l++) {
			for(int c = 0; c<10; c++) {
				mat[l][c] = l+c;
				}
			}
				
		// Exibir
		
		System.out.print("A matriz original\n");
		System.out.println("-------------------------------------");
		for(int l = 0; l<10; l++) {
			for(int c = 0; c<10; c++) {
			System.out.print(mat[l][c] + " ");;
			}
			
			System.out.println(" ");
		}
		
		System.out.println(" ");
		System.out.print("Matriz modifcada (troca coluna 2 e coluna 8)\n");
		System.out.println("-------------------------------------");
		
		System.out.print("Linha 2: ");
		for(int l = 0; l<10; l++) {
			System.out.print(mat[1][l] + " ");
		}
		
		System.out.print("\nLinha 8: ");
		for(int l = 0; l<10; l++) {
			System.out.print(mat[7][l] + " ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		for(int i = 0; i<10; i++) {
			
			temp = mat[l2][i];
			mat[l2][i] = mat[l8][i];
			mat[l8][i] = temp;	
		}
		
		for(int l = 0; l<10; l++) {
			for(int c = 0; c<10; c++) {
			System.out.print(mat[l][c] + " ");;
			}
			
			System.out.println(" ");
		}
	}
	
	static void mat2 (int [][] mat2) {
		
		int temp2 = 0, c4 = 3, c10 = 9;
		
		System.out.println(" ");
		System.out.print("Matriz modifcada (troca coluna 4 e coluna 10)\n");
		System.out.println("-------------------------------------");
		
		// Preenchimento 2 
		
		for(int l = 0; l<10; l++) {
			for(int c = 0; c<10; c++) {
				mat2[l][c] = l+c;
			}
		}
		
		System.out.print("Coluna 4: ");
		for(int l = 0; l<10; l++) {
			System.out.print(mat2[3][l] + " ");
		}
		
		System.out.print("\nColuna 10: ");
		for(int l = 0; l<10; l++) {
			System.out.print(mat2[9][l] + " ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		for(int i = 0; i<10; i++) {
			
			temp2 = mat2[i][c4];
			mat2[i][c4] = mat2[i][c10];
			mat2[i][c10] = temp2;	
		}
		
		for(int l = 0; l<10; l++) {
			for(int c = 0; c<10; c++) {
			System.out.print(mat2[l][c] + " ");;
			}
			
			System.out.println(" ");
		}	
	}
	
	static void mat3 (int [][] mat3) {
		
		int temp3 = 0, l5 = 4, c10 = 9;
		
		System.out.println(" ");
		System.out.print("Matriz modifcada (troca linha 5 e coluna 10)\n");
		System.out.println("-------------------------------------");
		
		// Preenchimento 3
		
		for(int l = 0; l<10; l++) {
			for(int c = 0; c<10; c++) {
				mat3[l][c] = l+c;
			}
		}
		
		System.out.print("Linha 5: ");
		for(int l = 0; l<10; l++) {
			System.out.print(mat3[4][l] + " ");
		}
		
		System.out.print("\nColuna 10: ");
		for(int l = 0; l<10; l++) {
			System.out.print(mat3[9][l] + " ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		
		for(int i = 0; i<10; i++) {
			
			temp3 = mat3[l5][i];
			mat3[l5][i] = mat3[i][c10];
			mat3[i][c10] = temp3;	
		}
		
		for(int l = 0; l<10; l++) {
			for(int c = 0; c<10; c++) {
			System.out.print(mat3[l][c] + " ");
			}
			
			System.out.println(" ");
		}
	}
	
	static void mat4 (int [][] mat4) {
		
		int temp4 = 0;
		
		System.out.println(" ");
		System.out.print("Matriz modifcada (a diagonal principal e diagonal secundária)\n");
		System.out.println("-------------------------------------");
		
		// Preenchimento 4
		
		for(int l = 0; l<10; l++) {
			for(int c = 0; c<10; c++) {
				mat4[l][c] = l+c;
			}
		}
		
		System.out.print("Diagonal principal: ");
		for(int l = 0; l<10; l++) {
			System.out.print(mat4[l][l] + " ");
		}
		
		System.out.print("\nDiagonal secundária: ");
		for(int l = 0; l<10; l++) {
			System.out.print(mat4[l][10-1-l] + " ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		
		for(int i = 0; i<10; i++) {
			
			temp4 = mat4[i][i];
			mat4[i][i] = mat4[i][10-1-i];
			mat4[i][10-1-i] = temp4;	
		}
		
		for(int l = 0; l<10; l++) {
			for(int c = 0; c<10; c++) {
			System.out.print(mat4[l][c] + " ");
			}
			
			System.out.println(" ");
		}
	}
	
	
	public static void main(String[] args) {
		
		int [][] mat = new int [10][10];
		int [][] mat2 = new int [10][10];
		int [][] mat3 = new int [10][10];
		int [][] mat4 = new int [10][10];
		
		mat1(mat);
		mat2(mat);
		mat3(mat);
		mat4(mat);
		
	}
}
