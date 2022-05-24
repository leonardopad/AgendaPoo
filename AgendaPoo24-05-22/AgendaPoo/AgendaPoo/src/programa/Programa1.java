package programa;

import java.util.ArrayList;
import java.util.List;

import tipos.Agenda;
import tipos.Contato;
import tipos.Pessoa;
import tiposBasicos.Celular;
import tiposBasicos.Email;
import tiposBasicos.Nome;
import tiposBasicos.Telefone;

public class Programa1 {

	public static void main(String[] args) {

		Nome nome1 = new Nome("Antonio", "Flavio");
		Telefone fone1 = new Telefone("041", "3556-5555");
		Email email1 = new Email("AntCosta@gmail.com");
		Celular cel1 = new Celular("041", "99998-9999");
		
		
		Nome nome2 = new Nome("Otavio", "Costa");
		Telefone fone2 = new Telefone("041", "3555-5555");
		Email email2 = new Email("otavioCosta@gmail.com");
		Celular cel2 = new Celular("041", "99999-9999");
	
		Contato contato1 = new Contato(nome1, email1, fone1, cel1);
		Contato contato2 = new Contato(nome2, email2, fone2, cel2);
		
		List<Contato> contatoLista1 = new ArrayList<Contato>();
		contatoLista1.add(contato1);
		contatoLista1.add(contato2);
		
		List<Contato> contatoLista2 = new ArrayList<Contato>();
		contatoLista2.add(contato1);
		contatoLista2.add(contato2);
		
		List<Contato> contatoLista3 = new ArrayList<Contato>();
		contatoLista1.add(contato1);
		contatoLista1.add(contato2);
		
		Nome nomePessoa1 = new Nome("Cleide", "Costa");
		Telefone fonePessoa1 = new Telefone("041", "3666-6666");
		Pessoa pessoa1 = new Pessoa(nomePessoa1, fonePessoa1, contatoLista1);
		
		Nome nomePessoa2 = new Nome("Joao", "Silva");
		Telefone fonePessoa2 = new Telefone("041", "3666-6666");
		Pessoa pessoa2 = new Pessoa(nomePessoa2, fonePessoa2, contatoLista2);
		
		Nome nomePessoa3 = new Nome("Cleide", "Costa");
		Telefone fonePessoa3 = new Telefone("041", "3666-6666");
		Pessoa pessoa3 = new Pessoa(nomePessoa1, fonePessoa3, contatoLista1);
		
		List<Pessoa> listaPessoas1 = new ArrayList<Pessoa>();
		listaPessoas1.add(pessoa1);
		listaPessoas1.add(pessoa2);
		Agenda agenda = new Agenda(listaPessoas1);
		System.out.println(agenda);
	}

}
