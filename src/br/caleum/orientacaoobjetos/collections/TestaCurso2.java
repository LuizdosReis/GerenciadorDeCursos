package br.caleum.orientacaoobjetos.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {

		Curso curso = new Curso("Dominando as collections", "Paulo Silveira");

		curso.adiciona(new Aula("Revisando ArrayList", 21));
		curso.adiciona(new Aula("Lista Objetos", 20));
		curso.adiciona(new Aula("Relacionamento lista e Objetos", 15));

		System.out.println(curso.getAulas());
		
		List<Aula> aulas = new ArrayList<>(curso.getAulas());
		
		Collections.sort(aulas);
		
		System.out.println(curso.getTempoTotal());
		
		System.out.println(curso);
		

		
	}
}
