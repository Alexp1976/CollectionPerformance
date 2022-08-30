package com.teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionManager {

	private List<Aluno> alunosArrayList = new ArrayList<>();
	private List<Aluno> alunosLinkedList = new LinkedList<>();
	private Set<Aluno> alunosHashSet = new HashSet<>();
	private Map<Integer, Aluno> alunosHashMap = new HashMap<>();
	
	int quantidade = 100000;
	
	public long adicionaArrayListNoFinal() {
						
		long inicio = System.currentTimeMillis();
		
		for (int index = 1; index <= quantidade; index++) {
			alunosArrayList.add(new Aluno(index));
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}
	
	public long adicionaLinkedListNoFinal() {
		
		long inicio = System.currentTimeMillis();
		
		for (int index = 1; index <= quantidade; index++) {
			alunosLinkedList.add(new Aluno(index));
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}

	public long adicionaHashSet() {
		
		long inicio = System.currentTimeMillis();
		
		for (int index = 1; index <= quantidade; index++) {
			alunosHashSet.add(new Aluno(index));
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}

	public long adicionaHashMap() {
		
		long inicio = System.currentTimeMillis();
		
		for (int index = 1; index <= quantidade; index++) {
			alunosHashMap.put(index, new Aluno(index));
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}

	public long adicionaArrayListNoInicio() {
		
		alunosArrayList.clear();
		
		long inicio = System.currentTimeMillis();
		
		for (int index = 1; index <= quantidade; index++) {
			alunosArrayList.add(0, new Aluno(index));
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}

	public long adicionaLinkedListNoInicio() {
		
		alunosLinkedList.clear();
		
		long inicio = System.currentTimeMillis();
		
		for (int index = 1; index <= quantidade; index++) {
			alunosLinkedList.add(0, new Aluno(index));
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}
	
	public long percorreArrayList() {
		
		long inicio = System.currentTimeMillis();
		
		alunosArrayList.forEach(aluno -> {
			
		});
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}
	
	public long percorreLinkedList() {
		
		long inicio = System.currentTimeMillis();
		
		alunosLinkedList.forEach(aluno -> {
			
		});
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}

	public long percorreHashSet() {
		
		long inicio = System.currentTimeMillis();
		
		alunosHashSet.forEach(aluno -> {
			
		});
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}

	public long percorreHashMap() {
		
		long inicio = System.currentTimeMillis();
		
		alunosHashMap.entrySet().forEach(aluno -> {
			
		});
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}

	public long pesquisaGetArrayList() {
		
		long inicio = System.currentTimeMillis();
		
		for (int index = 1; index <= quantidade; index++) {
			alunosArrayList.get(index - 1);
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}

	public long pesquisaGetLinkedList() {
		
		long inicio = System.currentTimeMillis();
		
		for (int index = 1; index <= quantidade; index++) {
			alunosLinkedList.get(index - 1);
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}
	
	public long pesquisaContainsArrayList() {
		
		long inicio = System.currentTimeMillis();
		
		for (int index = 1; index <= quantidade; index++) {
			Aluno aluno = new Aluno(index);
			alunosArrayList.contains(aluno);
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}
	
	public long pesquisaContainsLinkedList() {
		
		long inicio = System.currentTimeMillis();
		
		for (int index = 1; index <= quantidade; index++) {
			Aluno aluno = new Aluno(index);
			alunosLinkedList.contains(aluno);
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}
	
	public long pesquisaContainsHashSet() {
		
		long inicio = System.currentTimeMillis();
		
		for (int index = 1; index <= quantidade; index++) {
			Aluno aluno = new Aluno(index);
			alunosHashSet.contains(aluno);
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}
	
	public long pesquisaPelaChaveHashMap() {
		
		long inicio = System.currentTimeMillis();
		
		for (int index = 1; index <= quantidade; index++) {
			alunosHashMap.get(index);
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}
}
