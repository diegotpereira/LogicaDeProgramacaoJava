package br.com.java;

import br.com.java.modelo.Produto;

public class PrimeiraClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto = new Produto();
		produto.setNome("Smartphone");
		produto.setPrecoUnitario(500.0);
		produto.setQuantidade(15);
		
		exibirQuantidadeEmEstoque(produto);

	}
	
	static void exibirQuantidadeEmEstoque(Produto produto) {
		
		System.out.println("Quantidade em estoque do produto " + produto.getNome() + " é de " + produto.getQuantidade() + " unidade(S).");
	}

}
