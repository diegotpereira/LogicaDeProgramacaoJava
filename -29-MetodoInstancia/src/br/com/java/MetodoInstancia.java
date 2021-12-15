package br.com.java;

import br.com.java.modelo.Cliente;

public class MetodoInstancia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setPrimeiroNome("Fulano");
		cliente.setUltimoNome("De Tal");
		cliente.setTelefone("(11) 99999-9999");
		cliente.setEmail("fuladodetal@gmail.com");
		
		Cliente cliente2 = new Cliente();
		cliente2.setPrimeiroNome("Só");
		cliente2.setUltimoNome("Mais Um Silva");
		cliente2.setTelefone("(11) 99999-8888");
		
		System.out.println("Nome do Cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD() + ".");
		System.out.println("Nome do Cliente 2: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD() + ".");
	}
}
