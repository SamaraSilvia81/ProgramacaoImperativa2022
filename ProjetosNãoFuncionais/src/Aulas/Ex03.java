package Aulas;

import java.util.Scanner;

/* Aula 03 - 17/02/2022 - Revisão de Lógica - Desafio 3 - *Adicionar ao código passado uma validação de notas. 
 * Ou seja, o usuário precisa escrever notas de 0 até 10, nem mais, nem menos.
 */

public class Ex03 {
	
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
		
		Scanner leitor = new Scanner (System.in);
		
		double n1,n2,n3;
		String resposta;
		
		do {
			
			System.out.print("\nDigite sua 1° nota: ");
			n1 = leitor.nextDouble();
			
			if(n1>=0 && n1<=10) {
				
				System.out.print("Digite sua 2° nota: ");
				n2 = leitor.nextDouble();
				
				if(n2>=0 && n2<=10) {
					
					System.out.print("Digite sua 3° nota: ");
					n3 = leitor.nextDouble();
					
					if(n3>=0 && n3<=10) {
						
						calculoDaMedia(n1,n2,n3);
						
					} else {
						
						System.out.println("Valor inválido! Digite de 0 a 10.");
						
						System.out.print("Você deseja continuar? (Digite - sim - ou - não -) ");
						resposta = leitor.next();
						 
						System.out.print("\nDigite sua 3° nota: ");
						n3 = leitor.nextDouble();
						 
						calculoDaMedia(n1,n2,n3);
					}
					
				} else {				
					
					System.out.println("Valor inválido! Digite de 0 a 10.");
					
					System.out.print("Você deseja continuar? (Digite - sim - ou - não -) ");
					resposta = leitor.next();
					
					System.out.print("\nDigite sua 2° nota: ");
					n2 = leitor.nextDouble();
					
					if(n2>=0 && n2<=10) {
						
						System.out.print("Digite sua 3° nota: ");
						n3 = leitor.nextDouble();
						
						if(n3>=0 && n3<=10) {
							
							calculoDaMedia(n1,n2,n3);
							
						} else {
							System.out.println("Valor inválido! Digite de 0 a 10.");
						}
						
						System.out.print("Você deseja continuar? (Digite - sim - ou - não -) ");
						resposta = leitor.next();
						  
						System.out.print("\nDigite sua 3° nota: ");
						n3 = leitor.nextDouble();
						
						calculoDaMedia(n1,n2,n3);	
					}
				}
							
			} else {
				System.out.println("Valor inválido! Digite de 0 a 10.");
			}
						  
		  System.out.print("Você deseja continuar? (Digite - sim - ou - nao -) ");
		  resposta = leitor.next();
		  
		  } while(resposta.equals("sim"));  // Usando "equals" - obj1.equals(obj2) para String.
		
		System.out.println("\nObrigada pelo uso do serviço. Tenha um bom dia!");
		
		}
	}	
