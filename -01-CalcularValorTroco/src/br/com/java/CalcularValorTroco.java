package br.com.java;

import java.util.Scanner;

public class CalcularValorTroco {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = teclado.nextDouble();
		
		System.out.print("Digite valor pago pelo cliente: ");
		Double valorPago = teclado.nextDouble();
		
		Double resultado = valorProduto - valorPago;
		
		System.out.println("Troco: " + resultado);
		
		teclado.close();
	}

}
