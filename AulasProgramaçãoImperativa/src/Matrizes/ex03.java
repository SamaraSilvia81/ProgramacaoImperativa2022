package Matrizes;

import java.util.Scanner;

public class ex03 {
	
	public static void main(String[] args) {
	
		Scanner leitor = new Scanner (System.in);
		
		int [][] valor = new int [3][4];
		int temp = 0, l1 = 0, l2 = 2;
		
		System.out.print("Digite 12 valores: ");
		
		for(int l = 0; l<valor.length; l++) {
			for(int c = 0; c<valor[l].length;c++) {
				valor [l][c] = leitor.nextInt();
			}
		}
		
		System.out.print("----------------------------------\n");
		System.out.print("A matriz formada é: \n");
		
		for(int l = 0; l<valor.length; l++) {
			for(int c = 0; c<valor[l].length;c++) {
				System.out.print(valor[l][c] + " ");
			}
			
			System.out.println(" "); 
		}
		
		for(int i = 0; i<=valor.length;i++) {
			
			temp = valor[l1][i];
			valor[l1][i] = valor[l2][i];
			valor[l2][i] = temp;
		} 
		
		System.out.print("\nA nova matriz é (mudança de linha): " + "\n");
		
		for(int l = 0; l<valor.length; l++) {
			for(int c = 0; c<valor[l].length;c++) {
				System.out.print(valor[l][c] + " ");
				}
			
			System.out.println(" "); 
			}
		
	}
}
