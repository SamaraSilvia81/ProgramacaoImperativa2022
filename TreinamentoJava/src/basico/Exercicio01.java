package basico;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
	
		// Questão 01. Escreva um algoritmo para LER um valor (do teclado) e ESCREVER (na tela) o seu antecessor.
		
		Scanner teclado = new Scanner(System.in);
		Scanner ler = new Scanner(System.in);
		
		int valor, antecessor;
			
		System.out.print("Digite um valor: "); 
		valor = teclado.nextInt();
		
		antecessor = valor - 1;
		System.out.println("O antecessor de " +valor+ " é: " +antecessor);
	
  }
}
