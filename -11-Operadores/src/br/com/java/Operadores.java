package br.com.java;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		Double primerioNumero = teclado.nextDouble();
		
		System.out.println("Escolha a opereração [1 = + | 2 = - | 3 = * | 4 = /]: ");
		Integer operação = teclado.nextInt();
		
		System.out.println("Digite o segundo número: ");
		Double segundoNumero = teclado.nextDouble();
		
		Double resultado = null;
		
		if (operação.equals(1)) {
			
			resultado = primerioNumero + segundoNumero;
		}
		
		if (operação.equals(2)) {
			
			resultado = primerioNumero - segundoNumero;
					
		}
		
		if (operação.equals(3)) {
			
			resultado = primerioNumero * segundoNumero;
		} 
		
		
		if (operação.equals(4)) {
			
			resultado = primerioNumero / segundoNumero;
		}
		
		System.out.println("O resultado é: " + resultado);
	}

}
