package br.com.java;

public class EstruturaIf {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
		Boolean aContaTemTempoSuficenteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
		if (((movimentacaoMedia * 2) >= emprestimo) && aContaTemTempoSuficenteDeAbertura && temNomeLimpo) {
			
			System.out.println("Sim! Pode liberador empr�stimo.");
			
		} else {
			
			System.out.println("N�o pode liberar o empr�stimo.");
		}

	}

}
