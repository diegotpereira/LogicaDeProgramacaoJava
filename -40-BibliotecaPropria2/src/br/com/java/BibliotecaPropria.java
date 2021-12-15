package br.com.java;

import java.util.ArrayList;

import org.apache.commons.mail.EmailException;

import br.com.java.modelo.Carteiro;
import br.com.java.modelo.Interacao;

public class BibliotecaPropria {

	public static void main(String[] args) throws EmailException {
		// TODO Auto-generated method stub
		Interacao interacao = new Interacao();
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefa;
		int i = 0;
		
		// Deixei o true como condição do laço, pois, o que vai pará-lo é o fato do usuário digitar o "x" no console.
		while (true) {
			
			tarefa = interacao.lerLinha("Tarefa " + i + ": ");
			
			if ("x".contentEquals(tarefa)) {
				
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
		
		String para = interacao.lerLinha("Digite seu email: ");
		
		Carteiro.enviar(para, "Sua lista de tarefas", mensagem);
		
		interacao.imprimir("Fim...");
		
		interacao.fechar();
	}
	

}
