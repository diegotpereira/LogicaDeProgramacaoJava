package br.com.java.modelo;

public class Cliente {
	
	private String primeiroNome;
	
	private String ultimoNome;
	
	private String telefone;
	
	private String email;
	
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String obterNomeCompleto() {
		
		String nomeCompleto = primeiroNome + " " + ultimoNome;
		
		return nomeCompleto;
	}
	
	public String obterDDD() {
		
		String ddd = telefone.substring(0, 15);
		
		return ddd;
	}

}
