package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio22 {
	
	static int soma(int x) {
		
		int somatório = 0; 
		
		if(x>0) {
			for(int fat = 1; fat<=x; fat++) {
				somatório += fat;
			}
		} else {
			System.out.println("Valor inválido!");
		}
		
		return somatório;
}
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in); 
		
		int x;
		
		System.out.print("Escreva um valor: ");
		x = leitor.nextInt();
		
		System.out.println("O somatório de " +x+ " é: " +soma(x));
		
		
	}
}
