package Aulas;

/* Aula 02 - 15/02/2022 - Revis�o de L�gica - Desafio 1 - * Criar c�digo que ler tr�s valores e calcula a m�dia.
 * Se nota>=7 - aprovado
 *  7> nota >5 - aprovado por m�dia
 *   nota <5 - reprovado 
 */

import java.util.Scanner;

public class Ex01 {
	
	static void calculoDaMedia (double n1, double n2, double n3) {
		
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
	}
	
	public static void main(String[] args) {
		
Scanner leitor = new Scanner(System.in);
		
		/* double med, a,b,c;
		
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
		
		
		double n1, n2,n3;
		
		System.out.print("Digite sua 1� nota: ");
		n1 = leitor.nextDouble();
		
		System.out.print("Digite sua 2� nota: ");
		n2 = leitor.nextDouble();
		
		System.out.print("Digite sua 3� nota: ");
		n3 = leitor.nextDouble();
		
		calculoDaMedia(n1,n2,n3);
		
	}
}
