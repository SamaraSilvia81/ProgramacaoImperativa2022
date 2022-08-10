package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio08 {
	
	/* Quest�o 8. Fa�a um procedimento que recebe a idade de um nadador por par�metro e retorna, 
	 * tamb�m por par�metro, a categoria desse nadador de acordo com a tebela:
	 * 
	 * 5 a 7 - infantil a;
	 * 8 a 10 - infantil b;
	 * 11 a 13 - juvenil a;
	 * 14 a 17 - juvenil b;
	 * 18... - adulto.
	 * 
	 */
	
	static void categoriaNadador(int idade) {
		
		if(idade>=5 && idade<8) {
			System.out.println("Voc� � da liga Infantil A.");
		} else if (idade<11) {
			System.out.println("Voc� � da liga Infantil B.");
		} else if (idade<14) {
			System.out.println("Voc� � da liga Juvenil A.");
		} else if(idade<18) {
			System.out.println("Voc� � da liga Juvenil B.");
		} else {
			System.out.println("Voc� � da liga Adulto.");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = leitor.nextInt();
		
		categoriaNadador(idade);
		
	}
}
