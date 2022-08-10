package Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class MesesDoAno {
	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int AnoAtual;
		
		String mes[] = {"Jan", "Fev", "Mar","Abr","Mai","Jun","Jul", "Ago", "Set","Out","Nov","Dez"};
		int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i = 0; i<mes.length; i++) {
			System.out.println("O mês de " + mes[i] + " tem " + tot[i] + " dias ao todo.");
		}
		
		// Se o ano for bissexto colocar que Fevereiro tem 29 dias.
		
		System.out.print("\nDigite o ano atual: ");
		AnoAtual = leitor.nextInt();
		
		if(AnoAtual%4==0) {
			System.out.print("O seu ano é bissexto!");
			System.out.print("Então, o mês de " + mes[1] + " tem " + (tot[1]=29) + " dias ao todo.");
		} else {
			System.out.print("O seu ano não é bissexto, então " +mes[1]+ " continua tendo " +tot[1]+ " dias.");
		}
		
		// Eu quero poder exibir os meses do ano que tem só 31 dias. 
		
	}
}
