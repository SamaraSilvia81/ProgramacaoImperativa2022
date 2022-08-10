package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio02 {
	
	/* Quest�o 2. Escreva um procedimento que recebe as 3 notas de um aluno por par�metro e uma letra.
	 * Se a letra for A o procedimento calcular a m�dia aritm�tica das notas do aluno, se for P, a sua m�dia
	 * ponderada(pesos:5,3 e 2) e se for H, a sua m�dia harm�nica. 
	 * A m�dia calculada tamb�m deve retornar por par�metro. 
	 */
	
	
	static double notasDoAluno(double n1, double n2, double n3, char letra) {
		
		double mediaAritmetica = 0.0, mediaPonderada = 0.0, mediaHarmonica = 0.0;
			
		if(letra == 'A') {
			mediaAritmetica = (n1+n2+n3)/3;
			return mediaAritmetica;
		} else if (letra == 'P') {
			mediaPonderada = ((n1*5)+(n2*3)+(n3*2))/10;
			return mediaPonderada;
		} else if (letra == 'H') {
			mediaHarmonica = (3/1/n1) + (3/1/n2) + (3/1/n3);
			return mediaHarmonica;
		} else {
			return 0;
		}
					
	}
	

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		double n1, n2, n3;
		char letra; 
		
		System.out.print("Digite sua N1: ");
		n1 = leitor.nextDouble();
		
		System.out.print("Digite sua N2: ");
		n2 = leitor.nextDouble();
		
		System.out.print("Digite sua N3: ");
		n3 = leitor.nextDouble();
		
		System.out.println("Para a escolha da m�dia digite:");
		System.out.println("- A - M�dia Artim�tica");
		System.out.println("- P - M�dia Ponderada");
		System.out.println("- H - M�dia Harmonica");
		System.out.print("Qual a m�dia desejada? ");
		letra = leitor.next().charAt(0);
		
		System.out.println(notasDoAluno(n1,n2,n3,letra));
		
	}
}
