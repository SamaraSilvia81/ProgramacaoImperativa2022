package Atv1;

import java.util.Arrays;
import java.util.Scanner;


public class ex01 {	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] vetorA = new double[8];
		
		for(int contador = 0; contador < 8; contador++) {
			
			System.out.println("Digite o valor da entrada " + (contador + 1));
			vetorA[contador] = entrada.nextDouble();
		}
		
		double[] vetorB = new double[8];
		
		for(int contadorB = 0; contadorB < 8; contadorB++) {
			
			vetorB[contadorB] = vetorA[contadorB] * 3;
		}
		
		System.out.println("Os elementos do vetor B são: " + Arrays.toString(vetorB));
		
		/*
		for(int contadorB = 0; contadorB < 8; contadorB++) {
			
			System.out.println("Os elementos do vetor B são: " + vetorB[contadorB]);
			
		} */
		
		
		entrada.close();
	
	}
}
