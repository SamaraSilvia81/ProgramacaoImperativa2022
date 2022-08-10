package basico;

import java.util.Scanner;

public class Exercicio03 {
		public static void main(String[] args) {
			
			/* Questão 3. Escreva um algoritmo para ler o salário mensal atual de um funcionário 
			e o percentual de reajuste.
			*/
			
			Scanner leitor = new Scanner(System.in);
			
			String nome;
			double salario,reajuste,NovoSalario;
				
			System.out.print("Digite o nome do funcionário: "); 
			nome = leitor.next();
			
			System.out.print("Digite o salário dele(a): "); 
			salario = leitor.nextDouble();
			
			reajuste = (salario*20)/100;
			NovoSalario = reajuste + salario;
			
			System.out.println("O reajuste do(a) funcionário(a) " +nome+ " é: " +NovoSalario);
     }
}
