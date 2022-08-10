package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio13 {
	
	static void ordemCrescente(int a, int b, int c) {
		
		if (a==b || a==c || c==b) {
		    System.out.println("Os números não são distintos."); 
		} else if (a>b && a>c && b>c) {
			System.out.println("Os valores crescentes são: " +c+ "," +b+ "," +a+ ".");
		} else if (a>b && a>c && c>b) {
			System.out.println("Os valores crescentes são: " +b+ "," +c+ "," +a+ "."); 
		} else if (b>a && b>c && a>c) {
			System.out.println("Os valores crescentes são: " +c+ "," +a+ "," +b+ ".");	
		} else if (b>a && b>c && c>a) {
			System.out.println("Os valores crescentes são: " +a+ "," +c+ "," +b+ ".");
		} else if (c>a && c>b && a>b) {
			System.out.println("Os valores crescentes são: " +b+ "," +a+ "," +c+ ".");
		} else {
			System.out.println("Os valores crescentes são: " +a+ "," +b+ "," +c+ ".");
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
