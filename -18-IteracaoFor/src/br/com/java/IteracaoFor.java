package br.com.java;

public class IteracaoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] produtos = new Integer[] { 100, 225, 300 };
		
		for(int i = 0; i < produtos.length; i++) {
			Integer produto = produtos[i];
			
			System.out.println("Produto de c�digo: " + produto);
			
			if (produto.equals(225)) {
				System.out.println("Produto encontrado!");
				break;
			}
		}

	}

}
