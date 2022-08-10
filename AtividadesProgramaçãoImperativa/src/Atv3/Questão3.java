package Atv3;

import java.util.Random;

public class Quest�o3 {
	
	/* Fa�a um programa que preencha uma matriz M (2 � 2), calcule e mostre a matriz R,
	 * resultante da multiplica��o dos elementos de M pelo seu maior elemento.
	 */
	
	static void matrizR (int [][] vet) {
		
		int maior = 0;
		//int menor = 100;
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
				} 
				
				/*if(vet[l][c]<menor) {
					menor = vet[l][c];
				}*/
			}
		}
		
		System.out.print("\nMaior valor �: " +maior);
		//System.out.print("\nMenor valor �: " +menor);
		System.out.println(" ");
		
		System.out.print("\nA matriz resultante �: " + "\n");
		for(int l = 0; l<vet.length; l++) { // La�o de exibi��o.
			for(int c = 0; c<vet[l].length;c++) {
				System.out.print((vet[l][c] = vet[l][c]*maior) + "  ");
			}
			
			System.out.println(" ");
		}
	}
		
	public static void main(String[] args) {
		
		int [][] vet = new int [2][2];
		
		matrizR(vet);
					
	}	
}
