package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio10 {
	
	static boolean ehPar(int num) {
		
		if(num%2==0) {
			return true;
		} else {
			return false;
		}	
	}
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int num; 
		
		System.out.print("Digite um n�mero positivo: ");
		num = leitor.nextInt();
		
		System.out.println("O n�mero digitado � par? " +ehPar(num));
		
		
		
	}
}
