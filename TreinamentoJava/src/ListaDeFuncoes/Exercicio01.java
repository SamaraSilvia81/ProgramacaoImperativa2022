package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio01 {
	
	/* Questão 1. Faça uma função que recebe por parâmetro o raio de uma esfera e calcula o seu volume.
	 * Volume = 4/3*3,14*R^3
	 */
	
	static double volumeEsfera(double R) {
		
		return (4 * 3.14 * (R*R*R))/3; 
	}
	
	
	public static void main(String[] args) {
		
	Scanner raio = new Scanner(System.in);
	
	double R;
	
	System.out.print("Digite o raio da esfera: ");
	R = raio.nextDouble();
	
	System.out.println("O volume da sua esfera é: "+volumeEsfera(R));
	
		
	}
}
