package br.com.java;

import org.apache.commons.mail.EmailException;

import br.com.java.modelo.Carteiro;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		// TODO Auto-generated method stub
		Carteiro.enviar("diegotestefirebased@gmail.com", 
				"Envio de email com commons email", 
				"Se estiver vendo esse email é porque nosso envio funcionou!");
		
		
		System.out.println("Fim...");
	}

}
