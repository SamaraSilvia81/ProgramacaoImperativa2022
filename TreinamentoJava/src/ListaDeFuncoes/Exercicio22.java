package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio22 {
	
	static int soma(int x) {
		
		int somat�rio = 0; 
		
		if(x>0) {
			for(int fat = 1; fat<=x; fat++) {
				somat�rio += fat;
			}
		} else {
			System.out.println("Valor inv�lido!");
		}
		
		return somat�rio;
}
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in); 
		
		int x;
		
		System.out.print("Escreva um valor: ");
		x = leitor.nextInt();
		
		System.out.println("O somat�rio de " +x+ " �: " +soma(x));
		
		
	}
}
