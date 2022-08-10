package AulaDeFuncoes;

public class Exercicio15 {
	
	/* Procedimento para receber 3 valores reais de X,Y e Z.
	 * Verificar se os valores podem ser comprimentos do triângulo e depois retornar o seu tipo.
	 */
	
	static void triangulo(double x, double y, double z) {
		
		if(x<y+z && y<x+z && z<x+y) {
			if(x == y && y == z ) {
				System.out.println("Este triângulo é equilátero");	
			} else if (x != y && y!=z) {
				System.out.println("Este trinâgulo é escaleno");
			} else {
				System.out.println("Este trinâgulo é isósceles");
			}
		} else {
			System.out.println("Os valores digitados não compõem um triângulo");
		}
	}
	
	
	public static void main(String[] args) {
				
		triangulo(2,3,5);
	}

}
