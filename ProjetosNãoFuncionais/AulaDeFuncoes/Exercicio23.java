package AulaDeFuncoes;

import java.util.Scanner;

public class Exercicio23 {
	
	static double valor (int N) {
		
		/* Questão 23. A lógica da função é: Quando eu digitar um n° qualquer é preciso que ele se torne denominaodr de parada.
		 * Ou seja, começando do 1 e meu número é 3, tem que ser 1 + 1/2 + 1/3.
		 */
		
		double S = 0;
		
		for(double i = 1; i<=N; i++) {
			S += 1/i;  	
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
