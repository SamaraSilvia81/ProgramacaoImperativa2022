package Extras;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ex02 {
	
	public static void main(String[] args) {
		
		ex02 programa = new ex02();
        programa.executar();
    }
    
    private int sortear(List<Integer> numeros) {
        int sorteado = new Random().nextInt((20));
        return numeros.remove(sorteado);
    }

    private List<Integer> pares = new ArrayList<>();
    private List<Integer> impares = new ArrayList<>();

    ex02() {
        for (int numero = 0; numero <= 20; numero ++) {
        	if(numero%2==0) {
        		pares.add(numero);
        	} else {
        		impares.add(numero);
        	}
        }
    }
    
    public void executar() {
    	
        System.out.println("Sorteando 10 numeros pares:");
        for (int i = 0; i < 10; i++) {
            System.out.println(sortear(pares));
        }

        System.out.println("Sorteando 10 numeros impares:");
        for (int i = 0; i < 10; i++) {
            System.out.println(sortear(impares));
        }
    }    
   }
