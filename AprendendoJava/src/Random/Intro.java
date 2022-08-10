package Random;

import java.text.DecimalFormat;
import java.util.Random;

public class Intro {
	
	// Estudando Java com números aleatórios.
	
	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		
		int valor = aleatorio.nextInt(); // armazena valores aleatorios (sem intervalos) nessa variável valor.
		int valor2 = aleatorio.nextInt(30); // valores entre 0 e 29, se colocar 31 incluirá o 30.
		int valor3 = aleatorio.nextInt(30) + 1; // permite que seja n°s entre 1 e 30, pois sempre soma 1 ao resultado.
		double valor4 = aleatorio.nextDouble();  // sem limites entre 0.0 e 1.0, sem incluir o 1.0.
		double valor5 = aleatorio.nextDouble()*100;  // sem limites entre 0 e 100 (sem 100), com double/float você multiplica.
		double valor6 = (aleatorio.nextDouble()*100)+1; // inclui o 100.
		
		System.out.print("Número gerado1: " + valor); // valores positivos/negativos.
		System.out.print("\nNúmero gerado2: " + valor2); 
		System.out.print("\nNúmero gerado3: " + valor3); // lógica do valor3 - (valor máx - valor mín) + 1.
		System.out.print("\nNúmero gerado4: " + valor4);
		System.out.print("\nNúmero gerado5: " + valor5);
		System.out.print("\nNúmero gerado6: " + valor6);
		
		
		// Usando MATH.RANDOM
		
		System.out.print("\n\n --- Usando Math.Random --- \n");
		
		int num = (int) (Math.random()*101);
		double num2 = Math.random()*101;
		double num3 = Math.floor(Math.random()*101);
		
		System.out.print("\nNúmero gerado7: " + num); // Gerou números entre 0 e 100, incluindo o 100.
		System.out.print("\nNúmero gerado8: " + num2); 
		System.out.print("\nNúmero gerado9: " + num3);
		
		
		// Random e DecimalFormat		
		
		DecimalFormat numero = new DecimalFormat("0.00"); 
		
		System.out.print("\n\n --- Usando DecimalFormat --- \n");
		
		System.out.print("\nNúmero gerado10: " + numero.format(76.76543)); 
		System.out.print("\nNúmero gerado11: " + numero.format(valor6)); 
		
		double [][] matriz = new double [5][2];
		
		
		// Random, DecimalFormat e Matriz.
		
		System.out.print("\n\n --- Matriz --- \n\n");
		
		for(int i = 0; i<matriz.length; i++) {
			for(int c = 0; c<matriz[i].length; c++) {
				matriz[i][c] = (aleatorio.nextDouble()*100)+1;
				System.out.print(" " + numero.format(matriz[i][c]) + "   "); 
			}
			
			System.out.println(" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
