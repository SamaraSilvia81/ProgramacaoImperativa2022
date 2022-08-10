package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio04 {
	
	/* Quest�o 4. Fa�a um procedimento que recebe por par�metro os valores necess�rios para o c�lculo da f�rmula de baskara.
	 * Al�m de retorna, tamb�m por par�metro, as suas ra�zes, caso seja poss�vel calcular. 
	 * 
	 * -b+-raiz de b^2-4ac/2a
	 * 
	 */
	
	static double resultadoDoX1(int a, int b, int c) {
		
		double x1, delta;
		
		delta = (b*b) + (-4 * (a*c));
		
			x1 = (double) ((-(b) + Math.sqrt(delta)) / 2*a);
			return x1;  
	}
	
	
	static double resultadoDoX2 (int a, int b, int c) {
		
		double x2,x3, delta;
		
		delta = (b*b) + (-4 * (a*c));
		
		if (delta>0) {
			x2 = (double) ((-(b) - Math.sqrt(delta)) / 2*a);
			return x2;
		} else if (delta==0) {
			return x3 = (double) ((-(b) + Math.sqrt(delta)) / 2*a);
			} else {
				return 0;
				}
	}
	
	public static void main(String[] args) {
		
		Scanner calcula = new Scanner(System.in);
		
		int a,b,c;
		double x1,x2;
		
		System.out.println("Digite os coeficientes 'A', 'B' e 'C', respectivamente.");
		a = calcula.nextInt();
		b = calcula.nextInt();
		c = calcula.nextInt();

		
		x1 = resultadoDoX1(a,b,c);
		x2 = resultadoDoX2(a,b,c);
		
		if(x1==x2) {
			System.out.println("Sua equa��o s� tem uma ra�z/n�o tem raiz: "+x1); 
		} else {
			System.out.println("Sua equa��o tem duas ra�zes: "+x1+ "," +x2);
		}
		
		// A l�gica �: Se x1 e x2 forem iguais � porque ambos retornaram x3 (quando delta � 0) ou nada (quando delta � menor que 0).
		// Pergunta 1: Como fa�o para o corretor para de corrigir?
		
	}
}
