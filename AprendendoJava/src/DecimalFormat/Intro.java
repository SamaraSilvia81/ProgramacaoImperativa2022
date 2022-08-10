package DecimalFormat;

import java.text.DecimalFormat;
import java.util.Random;

public class Intro {
	
	public static void main(String[] args) {
		
		DecimalFormat numero = new DecimalFormat("0.00");
		
		System.out.print("N�mero gerado: " + numero.format(6.76543));
		System.out.print("\nN�mero gerado2: " + numero.format(76.76543));
		
		// coloca-se "0" na antes do ponto, pois ele vai pegar o valor e somar a esse 0.
		// Se colcoar qualquer outro n�mero antes do ponto, como "100", por exemplo, o valor fica 176.76.
		// A quantidade de zeros ap�s o ponto indica quantas casas voc� quer.
		
		
		// N�meros aleat�rios e arredondamento
		
		Random aleatorio = new Random();
		double valor = (aleatorio.nextDouble()*10)+1;
		
		System.out.print("\nN�mero gerado3: " + numero.format(valor)); 
		
		
		// Matriz, n�meros aleat�rios e arredondamento
		

		double [][] notas = new double [4][2];
		
		System.out.print("\n\n");
		System.out.print("A matriz gerada �: " + "\n\n");
		
		for(int i = 0; i<notas.length; i++) {
			for(int c = 0; c<notas[i].length; c++) {
				notas[i][c] = (aleatorio.nextDouble()*100)+1;
				System.out.print(numero.format(notas[i][c]) + "   "); 
			}
			
			System.out.println(" ");
		}
	}
}
