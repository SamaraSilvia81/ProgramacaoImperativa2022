package Aulas;

/* Aula 02 - 15/02/2022 - Revisão de Lógica - Desafio 1 - * Criar código que ler três valores e calcula a média.
 * Se nota>=7 - aprovado
 *  7> nota >5 - aprovado por média
 *   nota <5 - reprovado 
 */

import java.util.Scanner;

public class Ex01 {
	
	static void calculoDaMedia (double n1, double n2, double n3) {
		
		double med;
		
		med = (n1+n2+n3)/3;
		System.out.println("Média: " +med);
		
		if(med>=7) {
			System.out.println("Situação: APROVADO POR MÉDIA");
		} else if (med>=5) {
			System.out.println("Situação: APROVADO");
		} else {
			System.out.println("Situação: REPROVADO");
		}	
	}
	
	public static void main(String[] args) {
		
Scanner leitor = new Scanner(System.in);
		
		/* double med, a,b,c;
		
		System.out.println("Digite 3 valores: ");
		a = leitor.nextDouble();
		b = leitor.nextDouble();
		c = leitor.nextDouble();
		
		med = (a+b+c)/3;
		
		System.out.println("Sua média é: " +med);
		
		if(med>=7) {
			System.out.println("Você foi aprovado por média");
		} else if (med>=5) {
			System.out.println("Você foi aprovado");
		} else {
			System.out.println("Você está reprovado");
		}		
		/* 
		
		/* OBS: Se você quiser delimitar quantas casas quer que apareça é só você colocar:
		 * nome da variável:%(quantidade de casas)f. (se for string %s)...
		 * 
		 * String situ (situação)
		 * situ irá substituir os syso das condicionais.
		 * syso("\nMedia: %.1f  \nSituaçao: %s", media, situaçao);
		 * 
		 */		 
		
		/* DESAFIO 2
		 * Alterar o código do desafio 1 criando um método para calcular a média.
		 */
		
		
		double n1, n2,n3;
		
		System.out.print("Digite sua 1° nota: ");
		n1 = leitor.nextDouble();
		
		System.out.print("Digite sua 2° nota: ");
		n2 = leitor.nextDouble();
		
		System.out.print("Digite sua 3° nota: ");
		n3 = leitor.nextDouble();
		
		calculoDaMedia(n1,n2,n3);
		
	}
}
