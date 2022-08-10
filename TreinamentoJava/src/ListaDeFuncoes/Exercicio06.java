package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio06 {
	
	/* Questão 6. Faça um procedimento que recebe a idade de uma pessoa em anos, meses e dias 
	 * e retorna essa idade expressa em dias. 
	 */
	
	static int diasDeVida (int anos, int meses, int dias) {
		
		return anos*365 + meses*30 + dias;		
		
	}
	
	
	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		
		String name;
		int anos, meses, dias; 
		
		System.out.print("Digite seu nome: " );
		name = leitor.next();
		
		System.out.println("Digite quantos anos, meses e dias você viveu, respectivamente. " );
		anos = leitor.nextInt();
		meses = leitor.nextInt();
		dias = leitor.nextInt();
		
		System.out.println(name+ " ,você tem " +diasDeVida(anos,meses,dias)+ " dias de vida.");
		
	}
}
