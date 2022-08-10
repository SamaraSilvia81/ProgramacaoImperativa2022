package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio12 {
	
	static double pesoFeminino(double altura) {
		
		double pesoF;
		return pesoF = (62.1*altura)-44.7;
	}
	
	static double pesoMasculino(double altura) {
		
		double pesoM;
		return pesoM = (72.7*altura)-58;
	}
	
	static void pesoIdeal(double altura, char sexo) {
		
		if(sexo=='F') {
			System.out.println(pesoFeminino(altura));	
		} else if (sexo=='M') {
			System.out.println(pesoMasculino(altura));
		}
	}
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		char sexo;
		double altura;
		
		System.out.println("Digite seu sexo:");
		System.out.println("F - Feminino");
		System.out.println("M - Masculino");
		sexo = leitor.next().charAt(0);
		
		System.out.print("Digite sua altura: ");
		altura = leitor.nextDouble();		
		
		pesoIdeal(altura, sexo);
				
	}

}
