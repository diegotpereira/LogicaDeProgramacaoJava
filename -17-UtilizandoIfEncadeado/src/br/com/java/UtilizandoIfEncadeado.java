package br.com.java;

import java.util.Scanner;

public class UtilizandoIfEncadeado {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		Double peso = teclado.nextDouble();
		
		Boolean pesoLeve = (peso <= 60) && (peso > 0);
		Boolean pesoMedio = (peso > 60) && (peso <= 90);
		Boolean pesoPesado = peso > 90;
		
		
		if (pesoLeve) {
			
			
			System.out.println("O lutador(a) � peso leve.");
		} else if (pesoMedio) {
			
			System.out.println("O lutador(a) � peso m�dio.");
		} else if (pesoPesado) {
			
			System.out.println("O lutador(a) � peso pesado.");
		} else {
			
			System.out.println("O lutador(a) n�o se encaixa em categoria alguma.");
		}
		
		teclado.close();

	}

}
