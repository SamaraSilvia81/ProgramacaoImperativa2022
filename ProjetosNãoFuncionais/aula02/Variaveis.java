package aula02;

import java.util.Scanner; // Comando - Leia - 

public class Variaveis {	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int idade = 20;
		float velocidade = 40.5f;   // Alerta amarelo quando n�o se usa as vari�veis.
		double altura = 1.67;
		boolean ehAdulto = true; // = false
		char primeiraLetra = 'S';
		String nome;
		
		
		/* Scanner leitor = new Scanner(System.in); // Scanner (nome do leia) = new... // Criar o comando leia.
		
		idade = leitor.nextInt(); // Decidir o que vai ler - O usu�rio vai digitar um inteiro e o valor lido vai ser armazenado em "idade".
		
		System.out.println("A idade de " +nome+ " digitada foi: " + idade);
		
		// Para isso dar certo � precio apagar o 1� scanner e inicializar o string.
		
		*/
		
		
		/* velocidade = leitor.nextFloat();
		 * altura = leitor.nextDouble();
		 * ehAdulto = leitor.nextBoolean();
		 * nome = leitor.nextLine();   // Pode colocar s� - leitor.next(); - Pois o retorno � string.
		*/
	
		
		/* Se voc� quiser criar um comando "escreva" antes do "leia".
		 * Ex: "Digite um valor: " - ai depois o usu�rio escreve. 
		 * � preciso que coloque o comando "leia" antes das vari�veis. 
		 */
		
		System.out.print("Digite seu nome: "); // Se voc� deixar o - Ln - o que digitar vai aparecer uma linha ap�s.
		nome = leitor.next();
		
		System.out.println("O nome digitado foi " + nome);
		
	}
}
