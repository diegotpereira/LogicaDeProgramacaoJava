package br.com.java;

import br.com.java.modelo.Interacao;

public class BibliotecaPropria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interacao interacao = new Interacao();
		
		Integer numero = interacao.lerNumero("Digite um n�mero: ");
		interacao.imprimir("N�mero: " + numero);
		
		Double decimal = interacao.lerDecimal("Digite um n�mero decimal: ");
		interacao.imprimir("Decimal: " + decimal);
		
		interacao.erro("Essa � uma mensagem de erro!");
		
		interacao.fechar();
	}

}
