package br.com.java;

public class TipoLogico {
	
	public static void main(String[] args) {
		
		Boolean variavelVerdadeira = true;
		System.out.println("Variável verdadeira " + variavelVerdadeira);
		
		Boolean variavelFalse = false;
		System.out.println("Variável false: " + variavelFalse);
		
		System.out.println("--------------------------------");
		
		Integer idade = 20;
		
		Boolean podeTirarCNH = idade >= 18;
		
		if (podeTirarCNH) {
			System.out.println("Sim! Ele(a) pode tirar CNH.");
			
		} else {
			
			System.out.println("Não! Ele(a) não pode tirar CNH.");
		}
	}

}
