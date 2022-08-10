package Atv1;

import java.util.Arrays;
import java.util.Scanner;

public class ex04 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] vetorA = new double[15];
		double[] vetorB = new double[15];
		
		for(int contador = 0; contador < vetorA.length; contador++) {
			
			System.out.println("Digite o valor da posição " + (contador + 1) + " do vetor: ");
			vetorA[contador] = entrada.nextDouble();
		}
		
		for(int contador = 0; contador < vetorB.length; contador++) {
			
			vetorB[contador] = vetorA[contador] * vetorA[contador];
		}
		
		System.out.println("Os valores do vetor B são: " + Arrays.toString(vetorB));
		
		entrada.close();
		
		
	}
}
