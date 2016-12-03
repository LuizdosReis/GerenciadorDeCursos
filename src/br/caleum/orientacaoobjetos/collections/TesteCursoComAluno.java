package br.caleum.orientacaoobjetos.collections;

public class TesteCursoComAluno {
	public static void main(String[] args) {
		Curso curso = new Curso("Dominando as collections", "Paulo Silveira");

		curso.adiciona(new Aula("Revisando ArrayList", 21));
		curso.adiciona(new Aula("Lista Objetos", 20));
		curso.adiciona(new Aula("Relacionamento lista e Objetos", 15));
		
		curso.matricula(new Aluno("Rodrigo Turini", 34672));
		curso.matricula(new Aluno("Guilherme Silveira", 5617));
		curso.matricula(new Aluno("Mauricio Aniche", 17645));
		
		curso.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
	}

}
