package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio16 {
	
	static void valorNull() {
		
		Scanner leitor = new Scanner(System.in);
		
		int opcao, filho, qtdePessoas = 0, qtde350 = 0;
		double salario = 0.0, maiorSalario = 0.0, menorSalario = 0.0, somaFilho = 0.0, somaSalario = 0.0, mediaSalario, mediaFilho, percentual;
		boolean ctrl = true;
		
		while(ctrl == true) {
			
			System.out.print("Digite um sal�rio: ");
			salario = leitor.nextInt();
			somaSalario += salario;
			qtdePessoas++;
			
			if(salario<=350.00) {
				qtde350++;		
			} 
			
			for(int i=0; i<qtdePessoas; i++) {
				if(salario>maiorSalario) {
					maiorSalario = salario;
				} else if (salario<menorSalario) {
					menorSalario = salario;
				}
			}
			
			System.out.print("Digite quantidade de filhos: ");
			filho = leitor.nextInt();
			somaFilho += filho;
			
			System.out.println("Deseja inserir mais algum valor?");
			System.out.println("Digite 1 - Fazer novas entradas\nDigite 2 - Encerrar opera��es");
			opcao = leitor.nextInt();
			
			while(opcao!=1 && opcao!=2) {
				System.out.println("Op��o inv�lida! Tente novamente");
				opcao = leitor.nextInt();
			}
				
			if(opcao==2) {
				ctrl=false;
			}
		}
		
		
		percentual = (qtde350*100)/qtdePessoas;
		mediaSalario = somaSalario/qtdePessoas;
		mediaFilho = somaFilho/qtdePessoas;
	
		System.out.println("A m�dia dos sal�rios �: " +mediaSalario);
		System.out.println("A m�dia dos filhos �: " +mediaFilho);
		System.out.println("O maior sal�rio �: " +maiorSalario);
		System.out.println("O percentual dos sal�rios entre 0 e 350 �: " +percentual);	
	
		
	}
		
	
	public static void main(String[] args) {
		
		valorNull();
	
	}
}
