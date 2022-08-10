package basico;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
	
		/* Questão 4. Faça um algoritimo que leia a média de 3 notas de um(a) aluno(a)
		 * É preciso ter o nome e notas dos alunos.
		 */
		
		
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		double n1,n2,n3,soma = 0.0, media = 0.0;
			
		
		System.out.print("Digite o nome do aluno(a): "); 
		nome = leitor.next();
		
		System.out.print("Digite a sua 1° nota: "); 
		n1 = leitor.nextDouble();
		
		System.out.print("Digite a sua 2° nota: "); 
		n2 = leitor.nextDouble();
		
		System.out.print("Digite a sua 3° nota: "); 
		n3 = leitor.nextDouble();
		
		
		soma = n1+n2+n3;
		media = soma/3;
		
		System.out.println("A média de notas do(a) aluno(a) " +nome+ " é: " +media);
		
	}
}
