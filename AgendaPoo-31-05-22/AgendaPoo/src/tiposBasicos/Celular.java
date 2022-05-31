package tiposBasicos;

public class Celular {
	private String ddd;
	private String telefone;
	public Celular(String ddd, String telefone) {
		super();
		this.ddd = ddd;
		this.telefone = telefone;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return ddd + telefone;
	}
}
