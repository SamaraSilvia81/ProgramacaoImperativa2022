package Vetores;

import java.util.Arrays;

public class Busca {
	
	public static void main(String[] args) {
		
		int idade[] = {12,15,17,24,18,40};
		
		int pos = Arrays.binarySearch(idade, 18);
		
		System.out.print("As idades s�o: ");
		
		for(int valor:idade) {
			System.out.print(valor + " ");
		} 
			
		System.out.println("");
		
		System.out.println("A idade " +idade[4] + " est� na posi��o " +pos);
	
	}
}
