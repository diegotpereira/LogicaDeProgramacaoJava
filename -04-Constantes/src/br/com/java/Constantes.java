package br.com.java;

import java.util.Scanner;

public class Constantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		Integer idade = teclado.nextInt();
		
		Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;
		
		Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;
		
		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar a CNH. ");
			
		} else {
			System.out.println("Não Ele(a) não pode tirar a CNH. ");
		}
		
		teclado.close();
	}

}
