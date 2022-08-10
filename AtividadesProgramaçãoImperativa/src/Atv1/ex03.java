package Atv1;

import java.util.Arrays;
import java.util.Scanner;

public class ex03 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] vetorA = new double[5];
		double[] vetorB = new double[10];
		double[] vetorC = new double[vetorA.length + vetorB.length];
		
		for(int contador = 0; contador < vetorA.length; contador++) {
			
			System.out.println("Digite a entrada " + (contador + 1) + " do vetor A: ");
			vetorA[contador] = entrada.nextDouble();
		}
		
		for(int contador = 0; contador < vetorB.length; contador++) {
			
			System.out.println("Digite a entrada " + (contador + 1) + " do vetor B: ");
			vetorB[contador] = entrada.nextDouble();
		}
		
		for(int contador = 0; contador < vetorA.length; contador++) {
			
			vetorC[contador] = vetorA[contador];
		}
		
		for(int contador = 0; contador < vetorB.length; contador++) {
			
			vetorC[contador + vetorA.length] = vetorB[contador];
		}
		
		System.out.println("Os valores do vetor C é: " + Arrays.toString(vetorC));
		
		entrada.close();
	
	}
}
