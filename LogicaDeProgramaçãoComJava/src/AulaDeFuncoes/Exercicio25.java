package AulaDeFuncoes;

public class Exercicio25 {
	
	/*Quest�o 25. Escreva uma fun��o que recebe por par�metro um valor inteiro e positivo N e retorna o valor de S.
	 * S = n^2 + 1/ n + 3
	 */
	
	static double  calculaEnesima(int n) {
		
		double S = 0;   // porque faremos uma soma, ent�o � um ac�mulo.
		
		for(double i = 1; i<=n; i++) {
			S += (i*i + 1)/(i+3);  // para evitar que some tudo, divida por i e s� depois soma 3.	
		}
		
		
		/* S += (double)(i*i + 1)/(double)(i+3); - Dividir dois inteiros vem arredondado. - M�todo CAST.
		 * Ent�o � para o resultado no final venha como double. O inverso tamb�m funciona. 
		 */
		
		
		return S;
	}
	
	
	public static void main(String[] args) {
		
	System.out.println(calculaEnesima(1));
	System.out.println(calculaEnesima(2));
	System.out.println(calculaEnesima(3));
		
	}


}
