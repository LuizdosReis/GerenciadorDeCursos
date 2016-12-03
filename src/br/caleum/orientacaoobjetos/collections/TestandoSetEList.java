package br.caleum.orientacaoobjetos.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestandoSetEList {
	  public static void main(String[] args) {

	        Collection<Integer> numerosList = new ArrayList<Integer>();
	        Collection<Integer> numerosSet = new HashSet<Integer>();

	        long inicioInsercaoList = System.currentTimeMillis();

	        for (int i = 1; i <= 50000; i++) {
	            numerosList.add(i);
	        }
	        
	        long fimInsercaoList = System.currentTimeMillis();
	        
	        long inicioInsercaoSet = System.currentTimeMillis();

	        for (int i = 1; i <= 50000; i++) {
	            numerosSet.add(i);
	        }
	        
	        long fimInsercaoSet = System.currentTimeMillis();

	        long inicioPesquisaList = System.currentTimeMillis();
	        
	        for (Integer numero : numerosList) {
	            numerosList.contains(numero);
	        }

	        long fimPesquisaList = System.currentTimeMillis();
	        
	        long inicioPesquisaSet = System.currentTimeMillis();
	        
	        for (Integer numero : numerosSet) {
	            numerosSet.contains(numero);
	        }

	        long fimPesquisaSet = System.currentTimeMillis();
	        
	        System.out.println("Tempo insercao na Lista: " + (fimInsercaoList-inicioInsercaoList));
	        System.out.println("Tempo insercao no Set: " + (fimInsercaoSet-inicioInsercaoSet));
	        System.out.println("Tempo pesquisa na Lista: " + (fimPesquisaList-inicioPesquisaList));
	        System.out.println("Tempo pesquisa no Set: " + (fimPesquisaSet-inicioPesquisaSet));
	    }

}
