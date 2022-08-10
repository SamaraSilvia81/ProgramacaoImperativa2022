package Prova;

import java.util.Arrays;
import java.util.Scanner;

/* Considere uma matriz de tamanho 6 × 5. Faça um programa que coloque em ordem crescente os elementos de cada linha. 
 * Em seguida, colocar em ordem crescente os elementos de cada coluna. O programa deve exibir: 
 * a) a matriz original; 
 * b) a matriz com as linhas ordenadas; 
 * c) a matriz com as linhas e as colunas ordenadas.*/

public class TurmaA {
	
	public static void preencher (int [ ] [ ] mat){
		 
		//Scanner leitor = new Scanner(System.in);
		
        int i, j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                //mat[i][j] = leitor.nextInt();
                mat[i][j] = (int) (Math.random() * 100);
            }
        }
    }
    
    
    public static void exibir (int [ ] [ ] mat){
    	
    int i, j;
    
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                System.out.print("|" + mat[i][j] + "|    ");
            }
        System.out.println(" ");    
        }     
    }
    
    public static void linhaOrdenada(int [][] mat) {
		
    	int[] vetor = new int[mat[0].length];
	   	
	   	for (int i = 0; i<6; i++) {
	   		for (int j = 0; j <5; j++) {
	   			
	   			vetor[j] = mat[i][j];
	   		}
	   		
	   		Arrays.sort(vetor);
	   				   	
		   	for (int y = 0; y<5; y++) {
		   			mat[i][y] = vetor[y];
		   	 } 
	   	 }
    }
                   		 
    public static void matrizOrdenada(int [][] mat) {
    	
    	 int i, j,x,y;
    	 int temp = 0;
    	
    	 for (i = 0; i < mat.length; i++) {
             for (j = 0; j < mat[i].length; j++) {
            	 for (x = 0; x < mat.length; x++) {
                     for (y = 0; y < mat[x].length; y++) {
                    	 
                    	 if(mat[i][j]<mat[x][y]) {
                    		 
                    		 temp = mat[i][j];
                        	 mat[i][j] = mat[x][y];
                        	 mat[x][y] = temp;
                    		 
                    	 }                    
                     }
            	 }
             }
    	 }
    }
                 
               
    public static void main(String[] args) {
	
		int [ ] [ ] matriz = new int [6][5];	 
		 
		//System.out.print("Digite: ");
        preencher (matriz);
       
        System.out.println ("Exibição da matriz.");
        exibir (matriz);
        
        System.out.println ("\nLinha ordenada");
        linhaOrdenada (matriz);
        exibir (matriz);
        
        System.out.println ("\n Ordenamento da matriz.");
        matrizOrdenada(matriz);
        exibir (matriz);
        
        //Valores de Exemplo pro Scanner: 2 21 4 5 6 82 8 900 10 11 13 12 234 15 16 18 89 19 20 21 23 22 24 25 26 28 27 29 51 56
        
    }
}
