package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio11 {
	
	static void conceitoMedia(double media) {
		
		if(media>=0.0 && media<5.0) {
			System.out.println("Voc� � aluno tipo D.");
		} else if (media<7.0) {
			System.out.println("Voc� � aluno tipo C.");
		} else if (media<9.0) {
			System.out.println("Voc� � aluno tipo B.");
		} else if (media<11){
			System.out.println("Voc� � aluno tipo A.");
		} 
	}
	

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double media;
		
		System.out.print("Digite sua m�dia final: ");
		media = leitor.nextDouble();
		
		conceitoMedia(media);
		
	}
}
