package br.com.java;

import java.util.Scanner;

public class TipoTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Olá " + nome + " Bem vindo!");
		
		teclado.close();
		
		Character variavelChar = 'A';
		
		System.out.println("Variável caractere: " + variavelChar);

	}

}
