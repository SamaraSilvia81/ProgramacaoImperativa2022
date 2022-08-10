package Matrizes;

import java.util.Scanner;

public class ex03 {
	
	/* Capture do teclado valores para preenchimento de uma matriz M 3x3.
	 * Ap�s a captura imprima a matriz criada e encontre e exiba:
	 * A quantiadade de n�meros pares, os n�meros pares, a quantidade de n�meros �mpares e os n�meros �mpares.
	 */
	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int [][] valor = new int [3][3];
		
		System.out.print("Digite 9 valores: ");
		
		for(int l = 0; l<valor.length; l++) { // ler matriz
			for(int c = 0; c<valor[l].length;c++) {
				valor [l][c] = leitor.nextInt();
			}
		}
		
		System.out.print("----------------------------------\n");
		System.out.print("A matriz formada �: "+"\n");
		
		for(int l = 0; l<valor.length; l++) { // exibir matriz
			for(int c = 0; c<valor[l].length;c++) {
				System.out.print(valor[l][c] + " ");
			}
			
			System.out.println(" "); 
		}
		
		int qtdPar = 0, qtdImpar = 0;
		
		System.out.print("\nOs n�meros pares s�o: ");
		
		for(int l = 0; l<valor.length; l++) { // exibir par
			for(int c = 0; c<valor[l].length;c++) {
				
				if(valor[l][c]%2==0) {
					qtdPar++;
					System.out.print(valor[l][c] + " ");
				} 
			}
		}
		
		System.out.print("\nOs n�meros �mpares s�o: ");
		
		for(int l = 0; l<valor.length; l++) { // exibir impar
			for(int c = 0; c<valor[l].length;c++) {
				
				if(valor[l][c]%2!=0) {
					qtdImpar++;
					System.out.print(valor[l][c] + " ");
				} 
			}
		}
		
		System.out.println(" ");
		System.out.print("\nA quantidade de n�meros pares �: " +qtdPar);
		System.out.print("\nA quantidade de n�meros �mpares �: " +qtdImpar);
				 
	}
}
