package br.caleum.orientacaoobjetos.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private int tempoTotal = 0;
	private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> alunosPorMatricula = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
		this.tempoTotal += aula.getTempo();
	}
	
	public int getTempoTotal() {
		return tempoTotal;
	}
	
	/**
	 * metodo do Java 8
	 * @return
	 */
	public int getTempoTotal2(){
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "[Curso: "+ nome +", tempo total: "+ tempoTotal +", aulas: "+aulas+"]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.alunosPorMatricula.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculo(Aluno aluno) {
		return alunos.contains(aluno);	
	}

	public Aluno buscaMatriculado(int matricula) {
		if(!alunosPorMatricula.containsKey(matricula))
			throw new NoSuchElementException("Matricula não encontrada: "+ matricula);
		return alunosPorMatricula.get(matricula);
	}

}
