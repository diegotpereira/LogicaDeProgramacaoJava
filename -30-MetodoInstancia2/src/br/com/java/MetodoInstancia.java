package br.com.java;

import br.com.java.modelo.Produto;

public class MetodoInstancia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto = new Produto();
		produto.nome = "Notebook XZ10";
		produto.quantidadeEstoque = 11;
		
		System.out.println("Necessário repor estoque do produto " + produto.nome + "?" + eNecessarioReporEstoque(produto));
	}
	
	
	static Boolean eNecessarioReporEstoque(Produto produto) {
		
		if(produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
			
			return true;
			
		}
		
		System.out.println("Estoque cheio");
		
		return false;
	}

}
