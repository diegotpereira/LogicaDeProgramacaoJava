package br.com.java;

import java.util.Scanner;

public class PrimeiroMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[]
				{ "Java EE", "Spring", "Java OO Avan�ado"};
		
		System.out.println("Escolha dentre os cursos abaixo: ");
		
		for(int i = 0; i < cursos.length; i++) {
			
			System.out.println("[" + i + "]" + cursos[i]);
		}
		
		System.out.print("O curso que voc� deseja � o: ");
		Integer posicaoCursoEscolhido = teclado.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0
				&& posicaoCursoEscolhido < cursos.length;
		
		if (!posicaoValida) {
			
<<<<<<< HEAD
			encerrarProgramaPorCausaDePosicaoInvalida();
=======
			System.err.println("Posi��o inv�lida!");
			System.exit(1);
>>>>>>> d0a1eceb5a84b9f344b51e83b6d107ff692421d8
			
			imprimirTraco();
			
			String[] formasPagamento = new String[]
					{ "Cart�o", "Boleto "};
			
			System.out.println("Escolha uma forma de pagamento: ");
			for(int i = 0; i < formasPagamento.length; i++) {
				System.out.println("[" + i + "]" + formasPagamento[i]);
			}
			
			System.out.print("Sua forma de pagamento escolhida �: ");
			Integer posicaoFormaPagamentoEscolhida = teclado.nextInt();
			
			posicaoValida = posicaoFormaPagamentoEscolhida >= 0
					&& posicaoFormaPagamentoEscolhida < formasPagamento.length;
			
			if (!posicaoValida) {
<<<<<<< HEAD
				encerrarProgramaPorCausaDePosicaoInvalida();
=======
				System.err.println("Posi��o inv�lida!");
				System.exit(1);
>>>>>>> d0a1eceb5a84b9f344b51e83b6d107ff692421d8
			}
			
			String cursoEscolhido = cursos[posicaoCursoEscolhido];
			String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
			
			imprimirTraco();
			
			System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento � " + formaPagamentoEscolhida);
			
			teclado.close();
		}
		
	}
	static void imprimirTraco() {

		System.out.println("--------------------------------------");
	}
<<<<<<< HEAD
	
	static void encerrarProgramaPorCausaDePosicaoInvalida() {
        System.err.println("Posi��o inv�lida!");
        System.exit(1);
    }
=======
>>>>>>> d0a1eceb5a84b9f344b51e83b6d107ff692421d8

}
