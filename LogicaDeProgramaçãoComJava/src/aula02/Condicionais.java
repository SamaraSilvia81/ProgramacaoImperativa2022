package aula02;

import java.util.Scanner;

public class Condicionais {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		/* Condicionais em Portugol 
		 * 
		 * se(condição..) {
		 * ação
		 * }
		 * senao se(condição..) {
		 * ação
		 * } senao {
		 * ação...
		 * }
		 */
		
		
		/* Condicionais em Java
		 * 
		 * if (condição..) {
		 * ação
		 * }
		 * else if (condição..) {
		 * ação
		 * } else {
		 * ação...
		 * }
		 */
		
		
		/* 
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = leitor.nextInt();
		
		if(idade<12) {
			System.out.println("Você é uma criança");
		} else if(idade<18) {
			System.out.println("Você é jovem/adolescente");
		} else if(idade<60){
			System.out.println("Você é adulto");
		} else {
			System.out.println("Você é um idoso");
		}
		*/
		
		
		// Questão 1. Faça um algoritmo que leia os valores a,b e c e imprima na tela se a+b é menor que C. 
		
		
		int a,b,c;
		
		System.out.print("Digite um valor(a): ");
		a = leitor.nextInt();
		
		System.out.print("Digite um valor(b): ");
		b = leitor.nextInt();
		
		System.out.print("Digite um valor(c): ");
		c = leitor.nextInt();
		
		if(a+b<c) {
			System.out.println(a+ "+" +b+ " é menor que " +c);
		} else {
			System.out.println(a+ "+" +b+ " é maior/igual a " +c);
		}
		
		
	}
}
