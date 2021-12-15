package br.com.java;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

import br.com.java.modelo.Carteiro;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefa;
		
		int i = 0;
		
		// Deixei o true como condição do laço, pois, o que vai pará-lo é o fato do usuário digitar o "x" no console.
		while (true) {
			
			System.out.println("Tarefa " + i + ": ");
			tarefa = teclado.nextLine();
			
			if ("x".equals(tarefa)) {
				
				// Essa é a única maneira de parar esse laço.
				break;
			}
			
			linhas.add(tarefa);
			i++;
		}
		
		
		String tarefas = "";
		
		for(int iteracao = 0; iteracao < linhas.size(); iteracao++) {
			
			tarefas += linhas.get(iteracao) + "\n";
		}
		
		
		String mensagem = "Suas tarefas: \n" + tarefas;
		
		System.out.println("Digite seu email: ");
		String para =  teclado.next();
		
		Carteiro.enviar(para, "Sua lista de tarefas", mensagem);
	}

}
