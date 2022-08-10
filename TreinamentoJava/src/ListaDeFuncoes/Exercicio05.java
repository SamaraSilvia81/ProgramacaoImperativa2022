package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio05 {
	
	/* Quest�o 5. Fa�a uma fun��o que recebe por par�metro o tempo de dura��o de uma f�brica expressa em segundos
	 * e retorna tamb�m por par�metro esse tempo em horas, minutos e segundos. 
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
		
		System.out.print("Digite o tempo de dura��o da sua f�brica em segundos:  " );
		segundos = leitor.nextInt();
		
		System.out.println("A f�brica tem dura��o de " +duracaoEmHoras(segundos)+ " horas, " +duracaoEmMinutos(segundos)+ " minutos e " +duracaoEmSegundos(segundos));
		 
	}
}


