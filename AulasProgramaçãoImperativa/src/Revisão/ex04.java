package Revis�o;

import java.util.Scanner;

/* Aula 05 - 24/02/2022 - Vetores - Desafio 4 - * Criar c�digo que inicializa um vetor de 10 elementos do tipo double e calcular a m�dia deles;
 * O c�lculo da m�dia aritm�tica deve ser implementado por meio de um subprograma.
 * 
 * Li��o da Aula: Foque primeiro na resolu��o dos problemas e depois pense de forma simples na entrada de dados.
 */


public class ex04 {
	
	// Forma 1: Usado "For" para servir como entrada de valores. OBS: Mas voc� pode colocar de forma diferente.
	// Ou seja, essa fun��o serve para preenchimento dos valores automaticamente. Os valores s�o o pr�prio I.
	

	/* public static void exibeVetor(double[]vet) {
		
		for(int i=0;i<vet.length;i++) {
			System.out.println(vet[i]);
		}
	}
	*/
	
	public static double media(double[]vet) {  // vet � nome da vari�vel - valores armazenados nesse vetor, ent�o � s� preciso receber esse vetor.
		
		double soma = 0.0;
		
		for(int i = 0; i<vet.length;i++) {
			soma = soma + vet[i];     // vari�vel acumuladora para somar um conjunto de elementos ao longo do la�o de repeti��o.
		}
		
		return (soma/vet.length);
	}
	
	public static void main(String[] args) {
		
		/* Resolu��o da Forma 1:
		 
		 
		double [] notas = new double [10];
		double m;
		
		for(int i = 0; i<notas.length;i++) {
			notas[i]=i;
		}
		
		exibeVetor(notas);
		m = media(notas);
		
		System.out.println("\nA m�dia �: " + m);
		
		*/
		
		Scanner leitor = new Scanner (System.in);
		
		double [] notas = new double [10];
		
		for(int i = 0; i<notas.length;i++) {
				
				System.out.print("Digite suas " + (i+1) + "� notas: ");
				notas[i] = leitor.nextDouble();
		}
		
		System.out.println("\nSua m�dia � igual a: " + media(notas));
	
	}
}
