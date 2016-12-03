package br.caleum.orientacaoobjetos.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private int tempoTotal = 0;
	private List<Aula> aulas = new ArrayList<>();

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
	
	@Override
	public String toString() {
		return "[ Curso: "+ nome +", Instrutor: " + instrutor +", tempo total: "+ tempoTotal +"]";
	}

}
