package br.com.java;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		Double primerioNumero = teclado.nextDouble();
		
		System.out.println("Escolha a operera��o [1 = + | 2 = - | 3 = * | 4 = /]: ");
		Integer opera��o = teclado.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		Double segundoNumero = teclado.nextDouble();
		
		Double resultado = null;
		
		if (opera��o.equals(1)) {
			
			resultado = primerioNumero + segundoNumero;
		}
		
		if (opera��o.equals(2)) {
			
			resultado = primerioNumero - segundoNumero;
					
		}
		
		if (opera��o.equals(3)) {
			
			resultado = primerioNumero * segundoNumero;
		} 
		
		
		if (opera��o.equals(4)) {
			
			resultado = primerioNumero / segundoNumero;
		}
		
		System.out.println("O resultado �: " + resultado);
	}

}
