package Revis�o;

import java.util.Scanner;

public class ex01 {
	
	/* Aula 01 - 15/02/2022 - Revis�o de L�gica - Desafio 1 - * Criar c�digo que ler tr�s valores e calcula a m�dia.*/
	
	// Poderia fazer com fun��o:
	
	/*static void calculoDaMedia (double n1, double n2, double n3) {
		
		double med;
		
		med = (n1+n2+n3)/3;
		System.out.println("M�dia: " +med);
		
		if(med>=7) {
			System.out.println("Situa��o: APROVADO POR M�DIA");
		} else if (med>=5) {
			System.out.println("Situa��o: APROVADO");
		} else {
			System.out.println("Situa��o: REPROVADO");
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
				situ = "APROVADO POR M�DIA";
			} else if (media >=5) {
				situ = "APROVADO";
			} else {
				situ = "REPROVADO";
			}
			
			System.out.printf("\nM�dia: %.2f \nSitua��o: %s", media, situ);
		}
	
	
	/* Forma B: 
	 
	    double med, a,b,c;
		
		System.out.println("Digite 3 valores: ");
		a = leitor.nextDouble();
		b = leitor.nextDouble();
		c = leitor.nextDouble();
		
		med = (a+b+c)/3;
		
		System.out.println("Sua m�dia �: " +med);
		
		if(med>=7) {
			System.out.println("Voc� foi aprovado por m�dia");
		} else if (med>=5) {
			System.out.println("Voc� foi aprovado");
		} else {
			System.out.println("Voc� est� reprovado");
		}		
		
		double n1, n2,n3;
		
		System.out.print("Digite sua 1� nota: ");
		n1 = leitor.nextDouble();
		
		System.out.print("Digite sua 2� nota: ");
		n2 = leitor.nextDouble();
		
		System.out.print("Digite sua 3� nota: ");
		n3 = leitor.nextDouble();
		
		calculoDaMedia(n1,n2,n3);
		
		/* 
		
		/* OBS: Se voc� quiser delimitar quantas casas quer que apare�a � s� voc� colocar:
		 * nome da vari�vel:%(quantidade de casas)f. (se for string %s)...
		 * 
		 * String situ (situa��o)
		 * situ ir� substituir os syso das condicionais.
		 * syso("\nMedia: %.1f  \nSitua�ao: %s", media, situa�ao);
		 * 
		 */		 
		
		/* DESAFIO 2
		 * Alterar o c�digo do desafio 1 criando um m�todo para calcular a m�dia.
		 */
	}
	
	
