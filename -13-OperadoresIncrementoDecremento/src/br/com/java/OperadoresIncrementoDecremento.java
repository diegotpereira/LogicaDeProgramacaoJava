package br.com.java;

public class OperadoresIncrementoDecremento {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		Integer numeroIncremento = 10;
		numeroIncremento++;
		
		System.out.println("Número incremento: " + numeroIncremento);
		
		
		Integer numeroDecremento = 10;
		--numeroDecremento;
		System.out.println("Número decremento: " + numeroDecremento);
		
		Integer numero = 10;
		
		Integer numero02 = ++numero; // Primeiro incrementa e depois passa o valor para a variável "numero02"
		Integer numero03 = numero++; // Passa o valor para a variável "numero03" e depois incrementa.
		
		System.out.println("Número 02: " + numero02 + ", " + "Número03: " + numero03);
		
		

	}

}
