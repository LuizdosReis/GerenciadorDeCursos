package br.caleum.orientacaoobjetos.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {
	public static void main(String[] args) {
		Aula aula = new Aula("Revisando ArrayList",21);
		Aula aula2 = new Aula("Lista Objetos",20);
		Aula aula3 = new Aula("Relacionamento lista e Objetos",15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(aula);
		aulas.add(aula2);
		aulas.add(aula3);
		
		// ordena usando o CompareTo da classe
		Collections.sort(aulas);
		
		// ordena usando o Comparator que foi passado no parametro
		Collections.sort(aulas,Comparator.comparing(Aula::getTempo));
		// mesmo metodo do de cima porém esta é a nova versão do Java 8
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
	}
	

}
