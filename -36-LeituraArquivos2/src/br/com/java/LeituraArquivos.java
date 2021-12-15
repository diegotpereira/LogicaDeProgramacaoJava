package br.com.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		List<String> linhas = lerDoArquivo("C:/Users/administrator/Documents/Arquivo/tarefa.txt");
		
		System.out.println("Sua lista de tarefas do dia");
		
		for(int i = 0; i < linhas.size(); i++) {
			
			String tarefa = linhas.get(i);
			
			System.out.println(i + ": " + tarefa);
		}
	}
	
	static List<String> lerDoArquivo(String arquivo) throws IOException {
		
		Path path = Paths.get(arquivo);
		
		return Files.readAllLines(path);
	}

}
