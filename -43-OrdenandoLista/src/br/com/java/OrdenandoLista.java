package br.com.java;

import br.com.java.modelo.Aluno;

public class OrdenandoLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaAlunos listaAlunos = new ListaAlunos();
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "João";
		listaAlunos.adicionar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Maria";
		listaAlunos.adicionar(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "José";
		listaAlunos.adicionar(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.nome = "Luis";
		listaAlunos.adicionar(aluno4);
		
		Aluno aluno5 = new Aluno();
		aluno5.nome = "Fábio";
		listaAlunos.adicionar(aluno5);
		
		Aluno aluno6 = new Aluno();
		aluno6.nome = "Rodrigues";
		listaAlunos.adicionar(aluno6);
		
		iterar(listaAlunos);
		
		listaAlunos.ordenar();
		
		iterar(listaAlunos);
		
		listaAlunos.remover(aluno3);
		
		iterar(listaAlunos);
		

	}
	
	static void iterar(ListaAlunos listaAlunos) {
		
		for(int i = 0; i < listaAlunos.tamanho(); i++) {
			
			Aluno a = listaAlunos.obter(i);
			
			if (a != null) {
				
				System.out.println("Aluno: " + a.nome);
				
			} else {
				
				System.out.println("Aluno sem nome");
			}
		}
		
		System.out.println("--------------------------");
	}

}
