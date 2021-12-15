package br.com.java.modelo;

import java.util.Scanner;

public class Interacao {

Scanner teclado = new Scanner(System.in);
	
	public Integer lerNumero(String texto) {
		
		System.out.println(texto);
		
		return teclado.nextInt();
	}
	
	public Double lerDecimal(String texto) {
		
		System.out.println(texto);
		
		return teclado.nextDouble();
	}
	
	public String lerLinha(String texto) {
		
		System.out.println(texto);
		
		return teclado.nextLine();
	}
	
	public void fechar() {
		
		teclado.close();
	}
	
	public void imprimir(String texto) {
		
		System.out.println(texto);
	}
	
	
	public void erro(String texto) {
		
		System.err.println(texto);
	}
}
