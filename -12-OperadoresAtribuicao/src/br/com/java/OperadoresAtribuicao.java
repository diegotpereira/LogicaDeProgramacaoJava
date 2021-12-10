package br.com.java;

public class OperadoresAtribuicao {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Double numero = 7.0;
		
		numero = numero + 4;
		System.out.println("numero + 4: " + numero);
		
		numero += 4;
		System.out.println("numero += 4: " + numero);

		numero -= 4;
		System.out.println("numero -= 4: " + numero);

		numero *= 4;
     	System.out.println("numero *= 4: " + numero);
		
		numero /= 4;
		System.out.println("numero /= 4: " + numero);
		
		numero %= 4;
		System.out.println("numero %= 4: " + numero);

	}

}
