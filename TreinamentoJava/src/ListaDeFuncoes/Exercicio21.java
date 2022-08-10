package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio21 {
	
	static int divisores(int x) {
		
		int qtde = 0;
		
		System.out.print("Os divisores de " +x+ " são:");
		
		for(int i = 1; i<=x; i++) {
			if(x%i==0) {
				System.out.print(" " +i+ " ");
				qtde++;
			} 
		}
		
		return qtde;
}
	

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in); 
		
		int x;
		
		System.out.print("Escreva um valor: ");
		x = leitor.nextInt();
		
		System.out.println("\nO número de divisores de " +x+ " é: " +divisores(x));
		
	}
}
