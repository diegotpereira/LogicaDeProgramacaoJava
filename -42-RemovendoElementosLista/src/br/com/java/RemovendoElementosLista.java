package br.com.java;

import br.com.java.modelo.Aluno;

public class RemovendoElementosLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaAlunos lista = new ListaAlunos();
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "João";
		lista.adicionar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Maria";
		lista.adicionar(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "José";
		lista.adicionar(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.nome = "Luis";
		lista.adicionar(aluno4);
		
		Aluno aluno5 = new Aluno();
		aluno5.nome = "Fábio";
		lista.adicionar(aluno5);
		
		Aluno aluno6 = new Aluno();
		aluno6.nome = "Rodrigues";
		lista.adicionar(aluno6);
		
		for(int i = 0; i < lista.tamanho(); i++) {
			
			Aluno a = lista.obter(i);
			
			if (a !=null) { 
				
				System.out.println("Aluno: " + a.nome);
				
			} else {
				
				System.out.println("Aluno sem nome");
			}
		}
		
		System.out.println("---------------------------");
		
		lista.remover(aluno3);
		
		for(int i =0; i < lista.tamanho(); i++) {
			
			Aluno a = lista.obter(i);
			
			if (a != null) { 
				
				System.out.println("Aluno: " + a.nome);
				
				
			} else {
				
				System.out.println("Aluno sem nome");
			}
		}
	}

}
