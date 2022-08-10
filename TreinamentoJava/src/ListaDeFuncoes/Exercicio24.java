package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio24 {
	
	/* Questão 24. A lógica da função é: Quando eu digitar um n° qualquer é preciso que ele se torne denominador fatorial de parada.
	 * Ou seja, começando do 1 e meu número é 3, tem que ser 1/1! + 1/2! + 1/3!.
	 * Logo, 1 + (o fatorial de 2 é 2, ficando 1/2 = 0,5) + ( o fatorial de 3é 6, ficando 1/6 = 0,1666) = 1,66666667.
	 */
	
	
	static double fatorial (int N) {
		
		double multiplicadora = 1.0; 
		
		for(double fat = 1; fat<=N; fat++) {
			multiplicadora = multiplicadora*fat;
		}
		
		return multiplicadora;
	}
	
	static double valor (int N) {
		
		double S = 0;
	
		for(int i = 1; i<=N; i++) {
			S += 1/fatorial(i);	
		}
		
		return S; 
		
	}

	
	public static void main(String[] args) {
		
Scanner leitor = new Scanner(System.in);
		
		int N;
		
		System.out.print("Escreva um valor: ");
		N = leitor.nextInt();
		
		double resposta = valor(N);
		
		System.out.println(resposta);
		
		
	}
}
