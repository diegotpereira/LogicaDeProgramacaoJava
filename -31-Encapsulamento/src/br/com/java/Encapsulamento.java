package br.com.java;

import br.com.java.modelo.Cliente;

public class Encapsulamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setNome("Fulano Silva");
		cliente.setTelefone("(51) 99999-9999");
		System.out.println("Nome do cliente: " + cliente.getNome());
		System.out.println("Primeiro Nome: " + cliente.getPrimeiroNome());
		System.out.println("Sobrenome: " + cliente.getUltimoNome());
	}

}
