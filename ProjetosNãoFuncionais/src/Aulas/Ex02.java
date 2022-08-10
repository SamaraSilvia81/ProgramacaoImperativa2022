package Aulas;

import java.util.Scanner;

/* Aula 03 - 17/02/2022 - Revisão de Lógica - Desafio 2 - * Criar código que ler três valores e calcula a média.
 * Se nota>=7 - aprovado
 *  7> nota >5 - aprovado por média
 *   nota <5 - reprovado 
 */

public class Ex02 {
	
	static void calculoDaMedia (double n1, double n2, double n3) {
		
		double med;
		
		med = (n1+n2+n3)/3;
		System.out.println("\nMédia: " +med);
		
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
		Scanner menu = new Scanner(System.in);
		
		int opcao;
		double n1, n2,n3;
		
		while(true) { 
					
		System.out.print("\n##--Escolha de Resultado--##\n\n");
		System.out.print("|-------------------------------|\n");
		System.out.print("| Opção 1 - Resultado de Média  |\n");
		System.out.print("| Opção 2 - Sair                |\n");
		System.out.print("|-------------------------------|\n");
		System.out.print("Digite uma opção: ");
		opcao = menu.nextInt();		
		
		if(opcao==1) {
			
			System.out.print("Digite sua 1° nota: ");
			n1 = leitor.nextDouble();
			
			System.out.print("Digite sua 2° nota: ");
			n2 = leitor.nextDouble();
			
			System.out.print("Digite sua 3° nota: ");
			n3 = leitor.nextDouble();
			
			calculoDaMedia(n1,n2,n3);
			
		} else if(opcao==2) {
				System.out.println("\nAté logo!");
				break;
			}
		  }
		
		/* FORMA 2
		 * 
		 * String resposta;
		 * 
		 * do {
		 * 
		 * System.out.print("Digite sua 1° nota: ");
		 * n1 = leitor.nextDouble();
		 * 
		 * System.out.print("Digite sua 2° nota: ");
		 * n2 = leitor.nextDouble();
		 * 
		 * System.out.print("Digite sua 3° nota: ");
		 * n3 = leitor.nextDouble();
		 * 
		 * calculoDaMedia(n1,n2,n3);
		 * 
		 * System.out.print("Você deseja continuar? (Digite - sim - ou - não -)");
		 * resposta.leitor.next();
		 * 
		 * } while(resposta.equals("sim"));  // Usando "equals" - obj1.equals(obj2) para String.
		 *  
		 */
	}
}
