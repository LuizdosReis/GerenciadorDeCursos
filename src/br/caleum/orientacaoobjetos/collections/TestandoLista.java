package br.caleum.orientacaoobjetos.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoLista {
	public static void main(String[] args) {
		String aula1 = "Aula1";
		String aula2 = "Aula2";
		String aula3 = "aula3";
		
		List<String> list = new ArrayList<>();
		
		list.add(aula1);
		list.add(aula2);
		list.add(aula3);
		
		list.remove(2);
		
		list.get(0);
		
		Collections.sort(list);
		
		/**
		 * For Each do Java 8	
		 */
		list.forEach(aula ->{
			System.out.println("Aluna " + aula);
		});
		
		
		
	}

}
