package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio09 {
	
	
	static boolean ehPositivo(int num) {
		
		if(num>=0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um n�mero: ");
		num = leitor.nextInt();
		
		System.out.println("O n�mero digitado � positivo? " +ehPositivo(num));
	}
}
