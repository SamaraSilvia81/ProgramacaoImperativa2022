package aula02;

import java.util.Scanner;

public class Condicionais {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		/* Condicionais em Portugol 
		 * 
		 * se(condi��o..) {
		 * a��o
		 * }
		 * senao se(condi��o..) {
		 * a��o
		 * } senao {
		 * a��o...
		 * }
		 */
		
		
		/* Condicionais em Java
		 * 
		 * if (condi��o..) {
		 * a��o
		 * }
		 * else if (condi��o..) {
		 * a��o
		 * } else {
		 * a��o...
		 * }
		 */
		
		
		/* 
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = leitor.nextInt();
		
		if(idade<12) {
			System.out.println("Voc� � uma crian�a");
		} else if(idade<18) {
			System.out.println("Voc� � jovem/adolescente");
		} else if(idade<60){
			System.out.println("Voc� � adulto");
		} else {
			System.out.println("Voc� � um idoso");
		}
		*/
		
		
		// Quest�o 1. Fa�a um algoritmo que leia os valores a,b e c e imprima na tela se a+b � menor que C. 
		
		
		int a,b,c;
		
		System.out.print("Digite um valor(a): ");
		a = leitor.nextInt();
		
		System.out.print("Digite um valor(b): ");
		b = leitor.nextInt();
		
		System.out.print("Digite um valor(c): ");
		c = leitor.nextInt();
		
		if(a+b<c) {
			System.out.println(a+ "+" +b+ " � menor que " +c);
		} else {
			System.out.println(a+ "+" +b+ " � maior/igual a " +c);
		}
		
		
	}
}
