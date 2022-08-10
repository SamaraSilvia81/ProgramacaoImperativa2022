package Arrays;

import java.text.DecimalFormat;
import java.util.Random;

public class ex05 {
	
	public static void main(String[] args) {
		
		DecimalFormat numero = new DecimalFormat("0.00"); 
		Random entrada = new Random ();
		
		double[] vetorA = new double[8];
		double[] vetorB = new double[8];
		
		System.out.print("Os valores são:");
		
		for(int contador = 0; contador < 8; contador++) {
			
			vetorA[contador] = entrada.nextDouble();
			System.out.print(numero.format(vetorA[contador]) + "   "); 
		}
		
		for(int contadorB = 0; contadorB < 8; contadorB++) {
			
			vetorB[contadorB] = vetorA[contadorB] * 3;
		}
		
		//System.out.println("\nOs elementos do vetor B são: " + Arrays.toString(vetorB));
		
		
		for(int contadorB = 0; contadorB < 8; contadorB++) {
			
			System.out.println("Os elementos do vetor B são: " + numero.format(vetorB[contadorB]));
			
		} 
		
	
	}
}
