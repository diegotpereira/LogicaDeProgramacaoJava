package br.com.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path arquivo = Paths.get("C:/Users/administrator/Documents/Arquivo/arquivo.txt");
		
		List<String> linhas = Files.readAllLines(arquivo);
		
		for(int i = 0; i < linhas.size(); i++) {
			
			String nome = linhas.get(i);
			
			System.out.println("Jogador " + i + ": " + nome);
		}
	}

}
