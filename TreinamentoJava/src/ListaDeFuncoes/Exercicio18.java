package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio18 {
	
	static double fatorial (int N) {
		
		double multiplicadora = 1.0; 
		
		if(N>0) {
			for(double fat = 1; fat<=N; fat++) {
				multiplicadora = multiplicadora*fat;
			}
		} else {
			System.out.println("Valor inválido!");
		}
		
		return multiplicadora;
	}
	

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int N;
		
		System.out.print("Digite um valor qualquer: ");
		N = leitor.nextInt();		
		
		System.out.println("O fatorial de " +N+ " é: " +fatorial(N));
	}
}
