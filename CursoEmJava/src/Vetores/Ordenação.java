package Vetores;

import java.util.Arrays;

public class Ordenação {
	
	public static void main(String[] args) {
		
		double vetor[] = {3.45, 2.5, 5.8, -1.23, 9.90};
		Arrays.sort(vetor);
		
		for(double valor:vetor) {
			System.out.print(valor + " ");
		}
	}

}
