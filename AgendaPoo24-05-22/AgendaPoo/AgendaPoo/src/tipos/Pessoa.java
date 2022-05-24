package tipos;

import java.util.List;

import tiposBasicos.Nome;
import tiposBasicos.Telefone;

public class Pessoa {
	private Nome nome;
	private Telefone telefone;
	private List<Contato> contato;
	public Pessoa(Nome nome, Telefone telefone, List<Contato> contato) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.contato = contato;
	}
	public Nome getNome() {
		return nome;
	}
	public void setNome(Nome nome) {
		this.nome = nome;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public List<Contato> getContato() {
		return contato;
	}
	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", telefone= " + telefone + ", contato= " + contato + "]";
	}
	
}
