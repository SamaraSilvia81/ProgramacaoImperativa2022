package Aula03;

public class DoWhile {
	public static void main(String[] args) {
		
		/* No while para você executar seu bloco de repetição é preciso fazer uma checagem na condição.
		 * Caso não fosse obedecida, o bloco não seria executado. 
		 * 
		 * Já no Do...While - independente se vai aderir ou não a condição FAÇA, pelo menos na 1° vez. No final que é feito a checagem. 
		 * 
		 */
		
		/* DIFERENÇAS 
		 * Não é preciso inicializar a estrutura de controle ANTES do laço;
		 * Você faz sua checagem após a estrutura de repetição.
		 */
		
		/* int i;
		
		do {
			i = 0;
			System.out.println("blablabla");
		} while(i!=0);
		 */
		
		// Se você colocar i = 1 ou qualquer valor diferente de zero, então o que está dentro do syso repetirá.
		// É uma noção inversa da atuação do while. Faz primeiro, pergunta depois.
		
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		} while (i<11);
		
		// O laço de soma de um por um será repetido caso i seja menor que 11. 
		
		
		
		
		
	}
}
