package tipos;

import tiposBasicos.Celular;
import tiposBasicos.Email;
import tiposBasicos.Nome;
import tiposBasicos.Telefone;

public class Contato {
	private Nome nome;
	private Email email;
	private Telefone telefone;
	private Celular celular;
	public Contato(Nome nome, Email email, Telefone telefone, Celular celular) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.celular = celular;
	}
	
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", email= " + email + ",telefone= " + telefone + ", celular= " + celular + "]";
	}
}
