package ListaDeFuncoes;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercicio19 {
	
	static void ehMaior(int[] num) {
		
		Scanner leitor = new Scanner(System.in);
		
		int maior, menor;
		
		for(int i=0; i<num.length; i++) {
			num[i]+=5;
			System.out.println("Informe seu " +i+1+ "° número");
			num[i] = leitor.nextInt();
		}
		
		
		maior = num[0];
		menor = num[0];
		
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]+=5);
		}
		
		
		for(int i=0; i<num.length; i++) {
			
			if(maior<num[i]) {
				maior = num[i];
			} else if (menor>num[i]){
				menor = num[i];
			}
		}
		
		
		System.out.println("O maior valor é: " +maior+ " e o menor valor é: " +menor);
	
	}
	
	

	public static void main(String[] args) {
		
		ehMaior(null);
		
	}
}
