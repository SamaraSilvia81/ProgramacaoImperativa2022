package Atv1;

import java.util.Arrays;
import java.util.Scanner;

public class ex02 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] vetorA = new double[10];
		double[] vetorB = new double[10];
		double[] vetorC = new double[10];
		
		for(int contador = 0; contador < vetorA.length; contador++) {
			
			System.out.println("Digite o valor da entrada " + (contador + 1) +  " do vetor A:");
			vetorA[contador] = entrada.nextDouble();
		}
		
		for(int contador = 0; contador < vetorB.length; contador++) {
			
			System.out.println("Digite o valor da entrada " + (contador + 1) +  " do vetor B: ");
			vetorB[contador] = entrada.nextDouble();
		}
		
		for(int contador = 0; contador < vetorC.length; contador++) {
			
			vetorC[contador] = vetorA[contador] - vetorB[contador];
		}
		
		System.out.println("Os valores do vetor C é: " + Arrays.toString(vetorC));
		
		entrada.close();
		
	}
}
