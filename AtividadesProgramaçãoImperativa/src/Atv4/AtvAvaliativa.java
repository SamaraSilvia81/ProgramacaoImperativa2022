package Atv4;

import java.util.Scanner;

public class AtvAvaliativa {
	
	/* Na teoria dos sistemas, define-se o MINMAX de uma matriz como o maior elemento da linha
	 * em que se encontra o menor elemento da matriz. Elabore um programa que carregue uma
	 * matriz 4 × 7 com números reais, calcule e mostre seu MINMAX e sua posição (linha e coluna).
	 */
	
	public static void preencher (double [ ] [ ] mat){
		 
        Scanner in = new Scanner (System.in);
        
        int i, j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                mat[i][j] = in.nextDouble();
            }
        }
    }
    
    
    public static void exibir (double [ ] [ ] mat){
    int i, j;
    
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                System.out.print("|" + mat[i][j] + "|    ");
            }
        System.out.println(" ");    
        }     
    }
   

    public static void menor (double [ ] [ ] mat){
    	
    	double menor_ele = 100.0, maior_ele = 0.0;
    	int linha = 0, coluna = 0, coluna2 = 0;
	    
   
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j]<menor_ele) {
                	menor_ele = mat[i][j];
                	linha = i;
                	coluna = j;
                }
 	            if(mat[i][j]>maior_ele) {
 	            	maior_ele = mat[linha][j];
 	            	coluna2 = j;
 	                	
                }
            
         
            }   
        System.out.println(" ");    
        }    
        
        System.out.print("O menor elemento da matriz é: " +menor_ele+ " e ele está localizado na linha " +linha+ " e coluna " +coluna);
        System.out.print("\nO maior elemento da linha é: " +maior_ele+ " e ele está localizado na linha " +linha+ " e coluna " +coluna2);
        
        
    }
    
    
    public static void main(String[] args) {
	
	 double [ ] [ ] matriz = new double [4][7];

        System.out.print ("Preenchimento da matriz (sem números repetidos):" + " ");
        preencher (matriz);
       
        System.out.println ("\nExibição da matriz.");
        exibir (matriz);
        
        menor (matriz);
        
        // Valores de Exemplo: 2,1 2,2 4 5 6 8,1 8,2 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29
        
    }	
}
