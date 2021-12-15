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
		
		for (int i = 0; i < 2; i++) {
			
			System.out.println("Jogador " + i + ": ");
			
			String nome = teclado.nextLine();
			
			linhas.add(nome);
		}
		
		Path arquivo = Paths.get("C:/Users/administrator/Documents/Arquivo/arquivo.txt");
		Files.write(arquivo, linhas);
		
		teclado.close();
		
		System.out.println("Fim...");
	}

}
