package br.com.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefa;
		
		int i = 0;
		
		// Deixei o true como condi��o do la�o, pois, o que vai par�-lo � o fato do usu�rio digitar o "x" no console.
		while (true) {
			
			System.out.println("Tarefa " + i + ": ");
			tarefa = teclado.nextLine();
			
			if ("x".equals(tarefa)) {
				
				// Essa � a �nica maneira de parar esse la�o.
				break;
			}
			
			linhas.add(tarefa);
			i++;
		}
		
		escreverNoArquivo("C:/Users/administrator/Documents/Arquivo/tarefa.txt", linhas);
		
		System.out.println("Fim...");
	}
	
	static void escreverNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException {
		
		Path path = Paths.get(arquivo);
		Files.write(path,  linhas);
	}
}
