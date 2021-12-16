package br.com.java.modelo;

public class Contato {
	
	private String id;
	private String nome;
	private String telefone;
	
	
	public Contato() {
		super();
	}


	public Contato(String id, String nome, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public boolean isNovo() {
		
		return id == null;
	}
	
	public boolean vemDepoisDe(Contato contato) {
		
		if (contato == null) {
			
			return false;
		}
		
		return nome.compareTo(contato.getNome()) > 0;
	}

}