package br.com.java;

import br.com.java.modelo.Aluno;

public class AlgoritmoAvancado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaAlunos lista = new ListaAlunos();
		
		Aluno aluno = new Aluno();
		aluno.nome = "Jo�o";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Maria";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Jos�";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Luis";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "F�bio";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Rodrigues";
		lista.adicionar(aluno);
		
		
		aluno = new Aluno();
		aluno.nome = "Arthur";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Daniela";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Fl�via";
		lista.adicionar(aluno);
		
		for(int i = 0; i < lista.tamanho(); i++) {
			
			Aluno a = lista.obter(i);
			
			System.out.println("Aluno: " + a.nome);
		}
	}

}
