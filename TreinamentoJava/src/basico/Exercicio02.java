package basico;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		// Quest�o 2. Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever a �rea do ret�ngulo.
		
		// Vari�vel Real - No c�digo escreva o n�mero com ponto, mas como usu�rio escreva com v�rgula.
		
		
		Scanner leitor = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.print("Digite a base do ret�ngulo: "); 
		base = leitor.nextDouble();
		
		System.out.print("Digite a altura do ret�ngulo: "); 
		altura = leitor.nextDouble();
		
		area = (base*altura)/2;
		
		System.out.println("A �rea do seu ret�ngulo �: " +area);
		
	}
}
