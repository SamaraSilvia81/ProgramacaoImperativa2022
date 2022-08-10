package Extras;

import java.util.Arrays;
import java.util.Random;

public class ex01 {
	
	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		
		int[] vetorPar = new int[10];
		int[] vetorImpar = new int[10];
		
		int quantidadePar = 0;
		int quantidadeImpar = 0;
		
		while(true) {
			int valorRandomico = aleatorio.nextInt(20) + 1;
			
			if(valorRandomico % 2 == 0 && quantidadePar < 10) {
				vetorPar[quantidadePar] = valorRandomico;
				quantidadePar += 1;
			}
			if(valorRandomico % 2 == 1 && quantidadeImpar < 10) {
				vetorImpar[quantidadeImpar] = valorRandomico;
				quantidadeImpar += 1;
			}
			if(quantidadeImpar == 10 && quantidadePar == 10) {
				break;
			}
		}
		System.out.println(Arrays.toString(vetorPar));
		System.out.println(Arrays.toString(vetorImpar));	
		
	}
}
