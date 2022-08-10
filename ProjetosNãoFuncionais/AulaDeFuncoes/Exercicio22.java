package AulaDeFuncoes;

public class Exercicio22 {
	/* Quest�o 22. Fa�a uma fun��o que recebe, por par�metro, um valor inteiro e positivo.
	 * Retorna o somat�rio desse valor.
	 */
	
	static int somatorio(int num) {
		
		int i = 0;
		int S = 0;
		
		while(i<=num) {
			S += i;
			i++;
			
		}
		
		/* Usando "For" ficaria:
		 * for (int i=0; i<=num;i++){
		 * S+=i;
		 */
		
		
		return S;
	}
	
	public static void main(String[] args) {
		
		System.out.println(somatorio(2)); // Pois � = 0+1+2 = 3
		System.out.println(somatorio(5)); // Pois � = 0+1+2+3+4+5 = 15
	
	}
}
