package Atv5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex01 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		DecimalFormat converter = new DecimalFormat("0.00");
		
		double notaA1, notaA2, notaB1, notaB2 = 0.0, notaC1, notaC2, notaD1, notaD2, notaE1, notaE2, notaF1, notaF2;
		double medA,medB,medC,medD,medE,medF,medT, somaA = 0.0, somaB = 0.0, somaC = 0.0, somaD = 0.0, somaE = 0.0, somaF = 0.0;
		double aprov = 0.0, reprov = 0.0, perceAprov = 0.0, perceReprov = 0.0;
		String nomeA, nomeB, nomeC, nomeD, nomeE, nomeF;
		String sitA,sitB,sitC,sitD,sitE,sitF;
		
		/*ALUNO A*/
		
		System.out.print("Digite o nome do 1° aluno: ");
		nomeA = leitor.next();
		
		System.out.print("Digite a 1° nota de " +nomeA+ ": ");
		notaA1 = leitor.nextDouble();
		
		System.out.print("Digite a 2° nota de " +nomeA+ ": ");
		notaA2 = leitor.nextDouble();
		
		medA = (notaA1 + notaA2)/2;
		
		System.out.print("Média de " +nomeA+ ": " +converter.format(medA));
		somaA += medA;
		
		if(medA>=7) {
			sitA = "APROVADO";
			aprov++;
		} else {
			sitA = "REPROVADO";
			reprov++;
		}	
		
		System.out.print("\nSituação: " +sitA);
		
		
		/*ALUNO B*/
		
		System.out.print("\n\nDigite o nome do 2° aluno: ");
		nomeB = leitor.next();
		
		System.out.print("Digite a 1° nota de " +nomeB+ ": ");
		notaB1 = leitor.nextDouble();
		
		System.out.print("Digite a 2° nota de " +nomeB+ ": ");
		notaB2 = leitor.nextDouble();
		
		medB = (notaB1 + notaB2)/2;
		
		System.out.print("Média de " +nomeB+ ": " +converter.format(medB));
		somaB += medB;
		
		if(medB>=7) {
			sitB = "APROVADO";
			aprov++;
		} else {
			sitB = "REPROVADO";
			reprov++;
		}
		
		System.out.print("\nSituação: " +sitB);
		
		
		/*ALUNO C*/
		
		System.out.print("\n\nDigite o nome do 3° aluno: ");
		nomeC = leitor.next();
		
		System.out.print("Digite a 1° nota de " +nomeC+ ": ");
		notaC1 = leitor.nextDouble();
		
		System.out.print("Digite a 2° nota de " +nomeC+ ": ");
		notaC2 = leitor.nextDouble();

		medC = (notaC1 + notaC2)/2;
		
		System.out.print("Média de " +nomeC+ ": " +converter.format(medC));
		somaC += medC;
		
		if(medC>=7) {
			sitC = "APROVADO";
			aprov++;
		} else {
			sitC = "REPROVADO";
			reprov++;
		}	
		
		System.out.print("\nSituação: " +sitC);
		
		
		/*ALUNO D*/
		
		System.out.print("\n\nDigite o nome do 4° aluno: ");
		nomeD = leitor.next();
		
		System.out.print("Digite a 1° nota de " +nomeD+ ": ");
		notaD1 = leitor.nextDouble();
		
		System.out.print("Digite a 2° nota de " +nomeD+ ": ");
		notaD2 = leitor.nextDouble();
		
		medD = (notaD1 + notaD2)/2;
		
		System.out.print("Média de " +nomeD+ ": " +converter.format(medD));
		somaD += medD;
		
		if(medD>=7) {
			sitD = "APROVADO";
			aprov++;
		} else {
			sitD = "REPROVADO";
			reprov++;
		}	
		
		System.out.print("\nSituação: " +sitD);
		
		
		/*ALUNO E*/
		
		System.out.print("\n\nDigite o nome do 5° aluno: ");
		nomeE = leitor.next();
		
		System.out.print("Digite a 1° nota de " +nomeE+ ": ");
		notaE1 = leitor.nextDouble();
		
		System.out.print("Digite a 2° nota de " +nomeE+ ": ");
		notaE2 = leitor.nextDouble();
		
		medE = (notaE1 + notaE2)/2;
		
		System.out.print("Média de " +nomeE+ ": " +converter.format(medE));
		somaE += medE;
		
		if(medE>=7) {
			sitE = "APROVADO";
			aprov++;
		} else {
			sitE = "REPROVADO";
			reprov++;
		}	
		
		System.out.print("\nSituação: " +sitE);

		
		/*ALUNO F*/
		
		System.out.print("\n\nDigite o nome do 6° aluno: ");
		nomeF = leitor.next();
		
		System.out.print("Digite a 1° nota de " +nomeF+ ": ");
		notaF1 = leitor.nextDouble();
		
		System.out.print("Digite a 2° nota de " +nomeF+ ": ");
		notaF2 = leitor.nextDouble();
		
		medF = (notaF1 + notaF2)/2;
		
		System.out.print("Média de " +nomeF+ ": " +converter.format(medF));
		somaF += medF;
		
		if(medF>=7) {
			sitF = "APROVADO";
			aprov++;
		} else {
			sitF = "REPROVADO";
			reprov++;
		}	
		
		System.out.print("\nSituação: " +sitF);
		
		
		/* Tabela */
		
		System.out.println("\n\n");
		System.out.print("-- RELATÓRIO DE NOTAS --");
		System.out.println("\n");
		System.out.print("NOME      NOTA1     NOTA2    MÉDIA    SITUAÇÃO");
		System.out.print("\n" + nomeA + "     " + notaA1 + "      " + notaA2 + "     "+ converter.format(medA) + "      " + sitA);
		System.out.print("\n" + nomeB + "     " + notaB1 + "      " + notaB2 + "     "+ converter.format(medB) + "      " + sitB);
		System.out.print("\n" + nomeC + "     " + notaC1 + "      " + notaC2 + "     "+ converter.format(medC) + "      " + sitC);
		System.out.print("\n" + nomeD + "     " + notaD1 + "      " + notaD2 + "     "+ converter.format(medD) + "      " + sitD);
		System.out.print("\n" + nomeE + "     " + notaE1 + "      " + notaE2 + "     "+ converter.format(medE) + "      " + sitE);
		System.out.print("\n" + nomeF + "     " + notaF1 + "      " + notaF2 + "     "+ converter.format(medF) + "      " + sitF);
		
		
		/*MÉDIA DA TURMA*/
		
		medT = (medA + medB + medC + medD + medE + medF)/6;
		System.out.print("\n\nMédia da Turma é: " + converter.format(medT));
		
		
		/*APROVADOS E REPROVADOS*/
		
		perceAprov = (aprov*100)/6;
		perceReprov = (reprov*100)/6;
		
		System.out.print("\nO percentual dos aprovados é: " + converter.format(perceAprov) + " %");
		System.out.print("\nO percentual dos reprovados é: " + converter.format(perceReprov) + " %");
		
			
	}
}
