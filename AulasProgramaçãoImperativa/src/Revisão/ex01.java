package Revisão;

import java.util.Scanner;

public class ex01 {
	
	/* Aula 01 - 15/02/2022 - Revisão de Lógica - Desafio 1 - * Criar código que ler três valores e calcula a média.*/
	
	// Poderia fazer com função:
	
	/*static void calculoDaMedia (double n1, double n2, double n3) {
		
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
	}*/
	
	public static void main(String[] args) {
			
			Scanner read = new Scanner(System.in);
			
			double nota1, nota2, nota3;
			String situ;
			
			System.out.println("Insira sua primeira nota:");
			nota1 = read.nextDouble();
			
			System.out.println("\nInsira sua segunda nota:");
			nota2 = read.nextDouble();
			
			System.out.println("\nInsira sua terceira nota:");
			nota3 = read.nextDouble();
			
			double media = (nota1 + nota2 + nota3)/3;
			
			if (media >= 7) {
				situ = "APROVADO POR MÉDIA";
			} else if (media >=5) {
				situ = "APROVADO";
			} else {
				situ = "REPROVADO";
			}
			
			System.out.printf("\nMédia: %.2f \nSituação: %s", media, situ);
		}
	
	
	/* Forma B: 
	 
	    double med, a,b,c;
		
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
		
		double n1, n2,n3;
		
		System.out.print("Digite sua 1° nota: ");
		n1 = leitor.nextDouble();
		
		System.out.print("Digite sua 2° nota: ");
		n2 = leitor.nextDouble();
		
		System.out.print("Digite sua 3° nota: ");
		n3 = leitor.nextDouble();
		
		calculoDaMedia(n1,n2,n3);
		
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
	}
	
	
