package Aula03;

public class DoWhile {
	public static void main(String[] args) {
		
		/* No while para voc� executar seu bloco de repeti��o � preciso fazer uma checagem na condi��o.
		 * Caso n�o fosse obedecida, o bloco n�o seria executado. 
		 * 
		 * J� no Do...While - independente se vai aderir ou n�o a condi��o FA�A, pelo menos na 1� vez. No final que � feito a checagem. 
		 * 
		 */
		
		/* DIFEREN�AS 
		 * N�o � preciso inicializar a estrutura de controle ANTES do la�o;
		 * Voc� faz sua checagem ap�s a estrutura de repeti��o.
		 */
		
		/* int i;
		
		do {
			i = 0;
			System.out.println("blablabla");
		} while(i!=0);
		 */
		
		// Se voc� colocar i = 1 ou qualquer valor diferente de zero, ent�o o que est� dentro do syso repetir�.
		// � uma no��o inversa da atua��o do while. Faz primeiro, pergunta depois.
		
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		} while (i<11);
		
		// O la�o de soma de um por um ser� repetido caso i seja menor que 11. 
		
		
		
		
		
	}
}
