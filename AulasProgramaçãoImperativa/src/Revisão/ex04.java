package Revisão;

import java.util.Scanner;

/* Aula 05 - 24/02/2022 - Vetores - Desafio 4 - * Criar código que inicializa um vetor de 10 elementos do tipo double e calcular a média deles;
 * O cálculo da média aritmética deve ser implementado por meio de um subprograma.
 * 
 * Lição da Aula: Foque primeiro na resolução dos problemas e depois pense de forma simples na entrada de dados.
 */


public class ex04 {
	
	// Forma 1: Usado "For" para servir como entrada de valores. OBS: Mas você pode colocar de forma diferente.
	// Ou seja, essa função serve para preenchimento dos valores automaticamente. Os valores são o próprio I.
	

	/* public static void exibeVetor(double[]vet) {
		
		for(int i=0;i<vet.length;i++) {
			System.out.println(vet[i]);
		}
	}
	*/
	
	public static double media(double[]vet) {  // vet é nome da variável - valores armazenados nesse vetor, então é só preciso receber esse vetor.
		
		double soma = 0.0;
		
		for(int i = 0; i<vet.length;i++) {
			soma = soma + vet[i];     // variável acumuladora para somar um conjunto de elementos ao longo do laço de repetição.
		}
		
		return (soma/vet.length);
	}
	
	public static void main(String[] args) {
		
		/* Resolução da Forma 1:
		 
		 
		double [] notas = new double [10];
		double m;
		
		for(int i = 0; i<notas.length;i++) {
			notas[i]=i;
		}
		
		exibeVetor(notas);
		m = media(notas);
		
		System.out.println("\nA média é: " + m);
		
		*/
		
		Scanner leitor = new Scanner (System.in);
		
		double [] notas = new double [10];
		
		for(int i = 0; i<notas.length;i++) {
				
				System.out.print("Digite suas " + (i+1) + "° notas: ");
				notas[i] = leitor.nextDouble();
		}
		
		System.out.println("\nSua média é igual a: " + media(notas));
	
	}
}
