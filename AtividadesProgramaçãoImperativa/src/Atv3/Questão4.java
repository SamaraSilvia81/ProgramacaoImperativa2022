package Atv3;

import java.text.DecimalFormat;
import java.util.Random;

public class Questão4 {
	
	/*Faça um programa que preencha uma matriz 10 × 3 com as notas de dez estudantes em três provas. 
	 * O programa deverá mostrar um relatório com o número dos estudantes (número da linha) e a
	 * prova em que cada estudante obteve a menor nota. Ao final do relatório, deverá
	 * mostrar quantos estudantes tiveram a menor nota em cada uma das provas: na prova 1, 
	 * na prova 2 e na prova 3.
	 */
	
	static void notasDosAlunos() {
		
		double [][] notas = new double [10][3];
		Random aleatorio = new Random(11);
		
		double menor = 0.0;
		int provaBaixa = 0;
		
		DecimalFormat numero = new DecimalFormat("0.00");
		
		System.out.print("            Prova 1        Prova 2        Prova 3\n");
		
		//Para exibir os valores do random.
		for(int linha = 0; linha < notas.length; linha++) {
			System.out.print("Aluno " + (linha + 1) + "  ");  // para mostrar as linhas.
			for(int coluna = 0; coluna < notas[linha].length; coluna++) {
				notas[linha][coluna] = (aleatorio.nextDouble()*10);
				System.out.print("    " + (numero.format(notas[linha][coluna])) + "       ");  // para mostrar os valores da matriz.
			}
			System.out.println(" ");
		}
		
		System.out.print("\n");
		
		//Para exibir a menor nota de cada aluno em sua respectiva prova.
		for(int linha = 0; linha < notas.length; linha++) {
			for(int coluna = 0; coluna < notas[linha].length; coluna++) {
				if(coluna == 0) {
					menor = notas[linha][coluna];
					provaBaixa = coluna;
				}else {
					if(notas[linha][coluna] < menor) {
						menor = notas[linha][coluna];
						provaBaixa = coluna;
					}
				}
			}
			System.out.println("A nota mais baixa do aluno " + (linha+1) + " foi: " + numero.format(menor) + " na prova " + (provaBaixa+1));
			
		}
		
		//Exibir as menores notas de cada prova
		
		for(int coluna = 0; coluna<3; coluna++) {
			for(int linha = 0; linha <10; linha++) {
				
				if(coluna == 0) {
					provaBaixa = coluna;
				} else{
					if(notas[linha][coluna] < menor) {
						menor = notas[linha][coluna];
					}
					
				}
					
			}
						
			System.out.print("\nA nota mais baixa da prova " + (coluna+1) + " foi: " + numero.format(menor));
			
		}
	}
		
	
	public static void main(String[] args) {
		
		notasDosAlunos();
		
	}
}
