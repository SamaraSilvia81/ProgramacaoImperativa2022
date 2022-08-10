package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio13 {
	
	static void ordemCrescente(int a, int b, int c) {
		
		if (a==b || a==c || c==b) {
		    System.out.println("Os n�meros n�o s�o distintos."); 
		} else if (a>b && a>c && b>c) {
			System.out.println("Os valores crescentes s�o: " +c+ "," +b+ "," +a+ ".");
		} else if (a>b && a>c && c>b) {
			System.out.println("Os valores crescentes s�o: " +b+ "," +c+ "," +a+ "."); 
		} else if (b>a && b>c && a>c) {
			System.out.println("Os valores crescentes s�o: " +c+ "," +a+ "," +b+ ".");	
		} else if (b>a && b>c && c>a) {
			System.out.println("Os valores crescentes s�o: " +a+ "," +c+ "," +b+ ".");
		} else if (c>a && c>b && a>b) {
			System.out.println("Os valores crescentes s�o: " +b+ "," +a+ "," +c+ ".");
		} else {
			System.out.println("Os valores crescentes s�o: " +a+ "," +b+ "," +c+ ".");
		}
	}
		
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.print("Digite um valor - A -: ");
		a = leitor.nextInt();
		
		System.out.print("Digite um valor - B -: ");
		b = leitor.nextInt();
		
		System.out.print("Digite um valor - C -: ");
		c = leitor.nextInt();
	
		ordemCrescente(a,b,c);
	}
}
