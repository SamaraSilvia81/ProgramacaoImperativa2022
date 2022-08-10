package intermediario;

import java.util.Scanner;

public class TipoDeMenu {

	static Scanner val = new Scanner(System.in);
	static Scanner tip = val;
	static double valor, valori;
	static String tipov;
	
	static void menu() {
		
		System.out.println("Qual o valor do investimento? ");
		valor = val.nextDouble();
		
		System.out.println("Qual o tipo do investimento? ");
		tipov = tip.next();		
	}
		
	
	public static void main(String[] args) {
		
		int exit = -1;
				
		while(exit!=0) {
			System.out.println("Dejsa inserir mais algum valor?");
			System.out.println("Sim - Digite -1");
			System.out.println("Não - Digite 0");
		}
	}
}

