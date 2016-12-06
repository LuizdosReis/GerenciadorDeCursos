package br.caleum.orientacaoobjetos.collections;

import java.util.Comparator;

public class OrdenaPorMatricula implements Comparator<Aluno>{

	@Override
	public int compare(Aluno aluno, Aluno outroAluno) {
		return aluno.getNome().compareTo(aluno.getNome());
	}
	

}
