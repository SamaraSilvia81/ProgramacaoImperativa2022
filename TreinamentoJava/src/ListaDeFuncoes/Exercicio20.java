package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio20 {
	
	static void tabuada(int num) {
		
		for(int i = 0; i<=num; i++) {
			System.out.println(num+ "*" +i+ "=" +num*i);
		}	
	}
	

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int num;
		
		System.out.print("Digite um valor qualquer: ");
		num = leitor.nextInt();
		
		tabuada(num);
	}
}
