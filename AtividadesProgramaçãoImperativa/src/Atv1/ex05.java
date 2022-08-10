package Atv1;

import java.util.Arrays;
import java.util.Scanner;


public class ex05 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int [] vetorA = new int[20];
		int [] vetorB = new int[20];
		
		for(int contador = 0; contador<vetorA.length; ++contador) {
			
			System.out.println("Digite o valor da posição " + (contador + 1) + " do vetor: ");
			vetorA[contador] = leitor.nextInt();
			
		}
		
		int contadorNegativo = vetorA.length - 1;  // 0 a 20 = 21, logo 21 - 1 = 20 valores.
		for(int contador = 0; contador < vetorB.length; contador++) {
			
			vetorB[contador] = vetorA[contadorNegativo];
			contadorNegativo--;  // decremento
		}
		
		System.out.println("Os valores do vetor A são: " + Arrays.toString(vetorA));
		System.out.println("Os valores do vetor B são: " + Arrays.toString(vetorB));
		
		leitor.close();
		
		
		
	}
}
