package br.com.java;

import java.util.Scanner;

public class AlterandoValorVariavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto");
		Double valorProduto = teclado.nextDouble();
		
		System.out.println("Digite o tipo do pagamento [1 = á vista / 2 =  á prazo]: ");
		Integer tipoPagamento = teclado.nextInt();
		
		Boolean pagamentoAVista = tipoPagamento.equals(1);
		
		Double juros = 0.0;
		
		if (!pagamentoAVista) {
			
			juros = 10.0;
		}
		
		Double acrescimo = valorProduto * juros / 100;
		
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.println("Valor total: " + "R$ " + valorTotal);
		
		
		teclado.close();

	}

}
