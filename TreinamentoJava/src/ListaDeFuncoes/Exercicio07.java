package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio07 {
	
	// Quest�o 2. Descubra se o X � um n�mero perfeito ou n�o.
	
	static boolean isItPerfect(int x) {
		
		int somaDivisores = 0;
	
	// supondo que x = 6...
	// varredura de 1 at� 6 (x), e fazer opera��o %
	// para descobrir se � dividor ou n�o.
	
	for(int i = 1; i<x; i++) {
		// se x = 6, ent�o tem 1,2,3,4,5
		
		if(x%i==0) {
			// se entrar aqui = i � divisor de x.
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
			System.out.println("Parab�ns! O n�mero " +valor+ " � perfeito.");
		} else {
			System.out.println("Que pena! O n�mero " +valor+ " n�o � perfeito.");
		}	
	}
}
