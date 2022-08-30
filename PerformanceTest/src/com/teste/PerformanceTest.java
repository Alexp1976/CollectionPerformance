package com.teste;

public class PerformanceTest {

	public static void main(String[] args) {
		
		CollectionManager manager = new CollectionManager();
		System.out.println("## PREENCHENDO VALORES ##");
		System.out.println("Tempo para adicionar no final do Array List: " + manager.adicionaArrayListNoFinal());
		System.out.println("Tempo para adicionar no inicio do Array List: " + manager.adicionaArrayListNoInicio());
		System.out.println("Tempo para adicionar no final do Linked List: " + manager.adicionaLinkedListNoFinal());
		System.out.println("Tempo para adicionar no inicio do Linked List: " + manager.adicionaLinkedListNoInicio());
		System.out.println("Tempo para adicionar no HashSet: " + manager.adicionaHashSet());
		System.out.println("Tempo para adicionar no HashMap: " + manager.adicionaHashMap());
		
		System.out.println("\n## PERCORRENDO OS VALORES ##");		
		System.out.println("Tempo para percorrer o Array List: " + manager.percorreArrayList());
		System.out.println("Tempo para percorrer o Linked List: " + manager.percorreLinkedList());
		System.out.println("Tempo para percorrer o Hash Set: " + manager.percorreHashSet());
		System.out.println("Tempo para percorrer o Hash Map: " + manager.percorreHashMap());
		
		System.out.println("\n## TESTA A BUSCA PELO INDICE EM ARRAYLIST E LINKEDLIST ##");
		System.out.println("Tempo para pesquisar pelo indice no ArrayList: " + manager.pesquisaGetArrayList());
		System.out.println("Tempo para pesquisar pelo indice no Linked List: " + manager.pesquisaGetLinkedList());
		
		System.out.println("\n## TESTA O CONTAINS EM ARRAYLIST, LINKEDLIST E SET VS PESQUISAR PELA CHAVE DO HASHMAP##");
		System.out.println("Tempo para pesquisar pelo contains no ArrayList: " + manager.pesquisaContainsArrayList());
		System.out.println("Tempo para pesquisar pelo contains no LinkedList: " + manager.pesquisaContainsLinkedList());
		System.out.println("Tempo para pesquisar pelo contains no HashSet: " + manager.pesquisaContainsHashSet());
		System.out.println("Tempo para pesquisar pela chave do HashMap: " + manager.pesquisaPelaChaveHashMap());
	}

}
