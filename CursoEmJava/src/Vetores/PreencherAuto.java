package Vetores;

import java.util.Arrays;

public class PreencherAuto {
	
	public static void main(String[] args) {
		
		int vet[] = new int [20];
		
		Arrays.fill(vet, 2);
		
		for(int valor:vet) {
			System.out.print(valor + " ");
		}
	}
}
