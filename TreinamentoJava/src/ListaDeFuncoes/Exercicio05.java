package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio05 {
	
	/* Questão 5. Faça uma função que recebe por parâmetro o tempo de duração de uma fábrica expressa em segundos
	 * e retorna também por parâmetro esse tempo em horas, minutos e segundos. 
	 */
	
	
	static double duracaoEmSegundos(double segundos) {
		return segundos;
	}
	
	static double duracaoEmMinutos (double segundos) {
		return duracaoEmSegundos(segundos/60); 		
	}
	
	static double duracaoEmHoras (double segundos) {
		return (duracaoEmMinutos(segundos))/60; 		
	}


	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
	
		int segundos; 
		
		System.out.print("Digite o tempo de duração da sua fábrica em segundos:  " );
		segundos = leitor.nextInt();
		
		System.out.println("A fábrica tem duração de " +duracaoEmHoras(segundos)+ " horas, " +duracaoEmMinutos(segundos)+ " minutos e " +duracaoEmSegundos(segundos));
		 
	}
}


