package basico;

import java.util.Scanner;

public class Exercicio03 {
		public static void main(String[] args) {
			
			/* Quest�o 3. Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio 
			e o percentual de reajuste.
			*/
			
			Scanner leitor = new Scanner(System.in);
			
			String nome;
			double salario,reajuste,NovoSalario;
				
			System.out.print("Digite o nome do funcion�rio: "); 
			nome = leitor.next();
			
			System.out.print("Digite o sal�rio dele(a): "); 
			salario = leitor.nextDouble();
			
			reajuste = (salario*20)/100;
			NovoSalario = reajuste + salario;
			
			System.out.println("O reajuste do(a) funcion�rio(a) " +nome+ " �: " +NovoSalario);
     }
}
