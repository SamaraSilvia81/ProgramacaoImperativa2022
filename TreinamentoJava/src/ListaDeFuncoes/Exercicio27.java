package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio27 {
	
	static double elevadoA(int x, int y) {
		
		double multiplicativa = 1;
		
		for(int i=0; i<y; i++) {
			multiplicativa = multiplicativa*x;
		}
		
		return multiplicativa;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Digite a base da potência: ");
		x = leitor.nextInt();
		
		System.out.print("Digite o expoente: ");
		y = leitor.nextInt();
		
		System.out.println("A potência de " +x+ " elevado a " +y+ " é: " +elevadoA(x,y));
		
	}
}
