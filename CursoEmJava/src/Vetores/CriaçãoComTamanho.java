package Vetores;

public class CriaçãoComTamanho {
	
	// Este exemplo demosntra a criação de um vetor e o uso da propriedade length para mostrar o seu tamanho.
	
	public static void main(String[] args) {
		
		int n[] = {1,2,3,4,5};
		
		System.out.println("Total de casas de N " + n.length + "\n");
		
		for(int i = 0; i<n.length; i++) {
			System.out.println("Na posição " + i + " temos o valor " + n[i]);
		}
	
	}
}
