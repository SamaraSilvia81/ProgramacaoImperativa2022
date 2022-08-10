package AulaDeFuncoes;

import java.util.Scanner;

public class Exercicio01 {
	
	// Esta é a aula 04. 
	
	/* Supondo que eu queira uma função que exiba na tela todos os múltiplos de 3, de 0 a 100.
	 * 
	 * Forma 1: é possível fazer uma varredura de todos os n�meros escolhendo os múltiplos de 3. 
	 * Forma 2: Ou eu vou pulando de 3 em 3.
	 * 
	 * Se eu quiser somar é preciso fazer uma vari�vel acumuladora.
	 * 
	 */
	
	static int somaMultiplos() {
		
		int soma = 0;
		for(int i = 0; i<101;i++) {
			if(i%3==0) {
				soma += i;
			}
		}
		
		return soma;  // Serve para dar uma resposta aquela função; 
	}
	
	
	/* FORMA 2 DE RESOLVER ESSA QUESTÃO
	 
	 // Supondo que eu queira uma função que exiba na tela todos os múltiplos de 3, de "a" a "b".
	 
	 static int somaMultiplos(int a, int b) {
		
		int soma = 0;
		for(int i = a; i<b;i++) {
			if(i%3==0) {
				soma += i;
			}
		}
		
		return soma;  // Serve para dar uma resposta aquela função; 
		
	} */
	
	
	
	/* FORMA 3 DE RESOLVER ESSA QUESTÃO
	 
	 // Supondo que eu queira uma função que exiba na tela todos os múltiplos de 3, de "a" a "b".
	 
	 static int somaMultiplos(int a, int b) {
		
		int soma = 0;
		for(int i = a; i<b;i++) {
			if(i%3==0) {
				soma += i;
			}
		}
		
		return soma;  // Serve para dar uma resposta aquela função; } */
	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int retornoDeSoma = somaMultiplos();
		
		System.out.println(retornoDeSoma);
		
		
		
		/* FORMA 2 DE RESOLVER A QUESTÃO 
		
		int retornoDeSoma = somaMultiplos(0,50);
		
		System.out.println(retornoDeSoma); */
		
		
		/* FORMA 3 DE RESOLVER A QUESTÃO 
		
		int retornoDaSoma,a,b;
		
		System.out.println("Digite um valor para 'a':" );
		a = leitor.nextInt();
		
		System.out.println("Digite um valor para 'a':" );
		b = leitor.nextInt();
		
		retornoDaSoma = somaMultiplos(a,b);
		
		System.out.println("A soma dos múltiplos: " +retornoDaSoma); */
		
		
	}

}
