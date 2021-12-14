package br.com.java;

import java.util.Scanner;

public class RetornandoValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos =
				new String[]
						{ "Java EE", "Spring", "Java OO Avançado"};
		
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(cursos);
		
		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que você deseja é o: ", teclado);
		
		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos);
		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[]
				{ "Cartão", "Boleto" };
		
		imprimir("Escolha dentra as formas de pagamento abaixo: ");
		iterarEExibirPosicoesDoVetorString(formasPagamento);
		
		Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida é: ", teclado);
		
		posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);
		
		if (!posicaoValida) {
			
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
		teclado.close();
	}
	
	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner teclado) {
		imprimirEContinuarNaMesmaLinha(texto);
		
		Integer numero = teclado.nextInt();
		return numero;
	}
	
	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	
	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}
	
	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			imprimir("[" + i + "]" + vetor[i]);
		}
 	}
	
	static void imprimirTraco() {
		imprimir("--------------------------------------------");
	}
	
	static void encerrarProgramaPorCausaDaPosicaoInvalida() {
		
		System.err.println("Posição inválida!");
		
		System.exit(1);
	}
}
