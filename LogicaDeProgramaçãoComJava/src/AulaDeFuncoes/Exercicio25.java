package AulaDeFuncoes;

public class Exercicio25 {
	
	/*Questão 25. Escreva uma função que recebe por parâmetro um valor inteiro e positivo N e retorna o valor de S.
	 * S = n^2 + 1/ n + 3
	 */
	
	static double  calculaEnesima(int n) {
		
		double S = 0;   // porque faremos uma soma, então é um acúmulo.
		
		for(double i = 1; i<=n; i++) {
			S += (i*i + 1)/(i+3);  // para evitar que some tudo, divida por i e só depois soma 3.	
		}
		
		
		/* S += (double)(i*i + 1)/(double)(i+3); - Dividir dois inteiros vem arredondado. - Método CAST.
		 * Então é para o resultado no final venha como double. O inverso também funciona. 
		 */
		
		
		return S;
	}
	
	
	public static void main(String[] args) {
		
	System.out.println(calculaEnesima(1));
	System.out.println(calculaEnesima(2));
	System.out.println(calculaEnesima(3));
		
	}


}
