package Atv5;

import java.util.Scanner;

/*2. Faça um programa que preencha um vetor com dez números inteiros, calcule e
mostre o vetor resultante de uma ordenação decrescente.*/

public class ex02 {
	
	public static void preencher (int [ ] vet){
        
		Scanner leitor = new Scanner (System.in);
       
        for (int i = 0; i < vet.length; i++) {
        	vet[i] = leitor.nextInt();
        }
    }
	
	public static void exibir (int [ ] vet ){
		
		for(int i = 0; i<vet.length;i++) {
			System.out.print(vet[i] + " ");
		}
	 }
	
	public static void decrescente(int[]vet) {
		
		int aux;
		
		for(int l = 0; l<vet.length;l++) {
			for(int j = 0; j<l;j++) {
				
				if(vet[l]>vet[j]) {
					aux = vet[l];
					vet[l] = vet[j];
					vet[j] = aux;
				}	
			}
		}	
	}
	
	public static void main(String[] args) {
		
		int [] array = new int [10];
		
		System.out.print("Digite 10 valores: ");
		
		preencher(array);
		
		System.out.print("\nOs valores do array são: ");
		
		exibir(array);
		
		System.out.print("\nOs valores decrescentes do array são: ");
		
		decrescente(array);
		exibir(array);
			
	}		
}
