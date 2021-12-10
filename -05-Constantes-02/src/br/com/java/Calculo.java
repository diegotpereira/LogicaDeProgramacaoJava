package br.com.java;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		Double valorProduto = teclado.nextDouble();
		
		System.out.println("Digite a quantidade: ");
		Integer quantidade = teclado.nextInt();
		
		Double valorSubTotal = valorProduto *  quantidade;
		
		Boolean quantidadeMaiorOuIgualDez = quantidade >=10;
		
		
		Double percentualDesconto = 0.0;
		
		if (quantidadeMaiorOuIgualDez) {
			
			percentualDesconto = 10.0;
		}

		Double desconto = valorSubTotal * percentualDesconto / 100;
		
		Double valorTotalComDesconto = valorSubTotal - desconto;
		
		System.out.println("Valor Total é: " + valorTotalComDesconto);
		
		
		teclado.close();
	}

}
