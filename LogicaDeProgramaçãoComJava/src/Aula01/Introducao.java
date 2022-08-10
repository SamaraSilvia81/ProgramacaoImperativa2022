package Aula01;

import java.util.Scanner;

public class Introducao {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			System.out.println("Hello Word");   // escreva("Hello Word")
			
			int nomeDaVariavel = 10;
			float variavelReal = 10.2f; // variavel real
			double variavelRealDois = 10.2; // variavel real - suporta mais dados.
			char letra = 'S';
			String nome = "Samara"; // cadeia de caractéres
			boolean ehAdulto = false;
			boolean ehCrianca = true;
			
			System.out.println(nomeDaVariavel); // escreva "syso" para a função escreva.
			System.out.println(variavelReal);
			System.out.println(variavelRealDois);
			System.out.println(letra);
			System.out.println(nome);
			System.out.println("Seu nome é: " + nome);
			System.out.println(ehAdulto);
			System.out.println(ehCrianca);
			
			int idade;
			
			Scanner teclado = new Scanner(System.in); // para "leia"
			
			idade = teclado.nextInt();  // next line para texto. 
			
			System.out.println("A idade digitada foi: " + idade);
			
			
		
		}

	}