package br.com.java;

import br.com.java.modelo.Produto;

public class ClasseInstancia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Quantidade minima em estoque: " + Produto.quantidadeMinimaEstoque);
		
		Produto produto = new Produto();
		produto.nome = "Caneca";
		
//		Produto.quantidadeMinimaEstoque = 11;
//		System.out.println("Quantidade minima em estoque:" + Produto.quantidadeMinimaEstoque);
		
		Produto produto2 = new Produto();
		produto2.nome = "carteira";
		
		System.out.println("Quantidade minima em estoque: " + Produto.quantidadeMinimaEstoque);
		
		System.out.println("Produto 1: " + produto.nome);
		Impressao.informacao("Produto 1: " + produto.nome);
		
		System.out.println("Produto 2: " + produto.nome);
		Impressao.informacao("produto 2: " + produto2.nome);
	}

}
