package AulaDeFuncoes;

import java.util.Scanner;

public class Exercicio02 {
	
	// Esta é a aula 05.
	
	// Questão 2. Descubra se o X é um número perfeito ou não.
	
		static boolean isItPerfect(int x) {
			
			int somaDivisores = 0;
		
		// supondo que x = 6...
		// varredura de 1 até 6 (x), e fazer operação %
		// para descobrir se é dividor ou não.
		
		for(int i = 1; i<x; i++) {
			// se x = 6, então tem 1,2,3,4,5
			
			if(x%i==0) {
				// se entrar aqui = i é divisor de x.
				somaDivisores +=i;	
			}
		}
		
		if (somaDivisores == x) {
			return true;
		} else {
			return false;
		}
		
		}
		

		public static void main(String[] args) {
			
			Scanner leitor = new Scanner(System.in); 
			
			int valor;
			boolean ehPerfeito;
			
			System.out.print("Escreva um valor: ");
			valor = leitor.nextInt();
			
			ehPerfeito = isItPerfect(valor);
			
			if(ehPerfeito==true) {
				System.out.println("Parabéns! O número " +valor+ " é perfeito.");
			} else {
				System.out.println("Que pena! O número " +valor+ " não é perfeito.");
			}
		}
}
