package ListaDeFuncoes;

import java.util.Scanner;

public class Exercicio17 {
	
	static void valorNull() {
		
		Scanner leitor = new Scanner(System.in);
		
		int i = 0, num, pos = 0, valor;
		double soma = 0.0, somaPos = 0.0, media;
		boolean ctrl = true;
		
		while(ctrl == true) {
			
			System.out.print("Digite um valor qualquer: ");
			num = leitor.nextInt();
			soma += num;
			i++;
			
			if(num<0) {
				System.out.println("Opção inválida! Tente novamente");
			} else {
				somaPos+=num;
				pos++;
			}
			
			System.out.println("Deseja inserir mais algum valor?");
			System.out.println("Digite 1 - Fazer novas entradas\nDigite 2 - Encerrar operações");
			valor = leitor.nextInt();
			
			while(valor!=1 && valor!=2) {
				System.out.println("Opção inválida! Tente novamente");
				valor = leitor.nextInt();
			}
				
			if(valor==2) {
				ctrl=false;
			}
		}
		
		media = somaPos/i;
		
		System.out.println("A média dos valores é: " +media);
	}
		

	public static void main(String[] args) {
	
		valorNull();
		
	}
}
