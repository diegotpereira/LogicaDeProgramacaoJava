package br.com.java;

public class TipoLogico {
	
	public static void main(String[] args) {
		
		Boolean variavelVerdadeira = true;
		System.out.println("Vari�vel verdadeira " + variavelVerdadeira);
		
		Boolean variavelFalse = false;
		System.out.println("Vari�vel false: " + variavelFalse);
		
		System.out.println("--------------------------------");
		
		Integer idade = 20;
		
		Boolean podeTirarCNH = idade >= 18;
		
		if (podeTirarCNH) {
			System.out.println("Sim! Ele(a) pode tirar CNH.");
			
		} else {
			
			System.out.println("N�o! Ele(a) n�o pode tirar CNH.");
		}
	}

}
