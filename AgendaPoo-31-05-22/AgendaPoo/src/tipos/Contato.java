package tipos;

import tiposBasicos.Celular;
import tiposBasicos.Email;
import tiposBasicos.Nome;
import tiposBasicos.Telefone;

public class Contato {
	

	private String Celular;
	private String Telefone;
	private String Email;
	private String Ddd;
	private String Ddd2;
	
	public Contato( String celular, String telefone, String email, String ddd, String ddd2) {
		super();
		Celular = celular;
		Telefone = telefone;
		Email = email;
		Ddd = ddd;
		Ddd2 = ddd2;
	}
	
	
	public String getCelular() {
		return Celular;
	}
	public void setCelular(String celular) {
		Celular = celular;
	}
	public String getTelefone() {
		return Telefone;
	}
	public String getDdd() {
		return Ddd;
	}
	public String getDdd2() {
		return Ddd2;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

	
	@Override
	public String toString() {
		return " Email " + Email + " telefone: " + Ddd + Telefone + " Celular: " + Ddd2 +  Celular + " \n"; 
	}
	
	

}
