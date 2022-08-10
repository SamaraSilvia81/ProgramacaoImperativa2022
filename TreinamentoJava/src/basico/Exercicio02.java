package basico;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		// Questão 2. Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
		
		// Variável Real - No código escreva o número com ponto, mas como usuário escreva com vírgula.
		
		
		Scanner leitor = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.print("Digite a base do retângulo: "); 
		base = leitor.nextDouble();
		
		System.out.print("Digite a altura do retângulo: "); 
		altura = leitor.nextDouble();
		
		area = (base*altura)/2;
		
		System.out.println("A área do seu retângulo é: " +area);
		
	}
}
