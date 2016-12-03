package br.caleum.orientacaoobjetos.collections;

public class TestaCurso {
	public static void main(String[] args) {
		Curso curso = new Curso("Dominando as collections", "Paulo Silveira");
		
		curso.adiciona(new Aula("Revisando ArrayList",21));
		curso.adiciona(new Aula("Lista Objetos",20));
		curso.adiciona(new Aula("Relacionamento lista e Objetos",15));
		
		System.out.println(curso.getAulas());
		
		
	}
	

}
