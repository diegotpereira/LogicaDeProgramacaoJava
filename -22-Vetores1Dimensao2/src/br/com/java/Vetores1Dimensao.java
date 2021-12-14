package br.com.java;

import java.util.Scanner;

public class Vetores1Dimensao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String[] tarefas = new String[5];
		
		for(int i = 0; i < tarefas.length; i++) {
			System.out.println("Tarefa " + i + ": ");
			tarefas[i] = teclado.nextLine();
		}
		
		System.out.println("Suas tarefas são: ");
		for(int i = 0; i < tarefas.length; i++) {
			System.out.println(i + ": " + tarefas[i]);
		}
		
		teclado.close();
	}

}
