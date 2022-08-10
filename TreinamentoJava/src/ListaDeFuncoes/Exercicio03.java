package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio03 {
	
	static boolean ehPrimo(int num) {
		
		for(int i=2; i<num; i++) {
			if(num%i==0)
				return false;
		} return true;
	}
	
	
	public static void main(String[] args) {
		
		Scanner primo = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um vlaor inteiro positivo: ");
		num = primo.nextInt();
		
		System.out.println("O número " +num+ " é primo? " +ehPrimo(num));
	}

}
