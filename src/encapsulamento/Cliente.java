package encapsulamento;

public class Cliente {
	
	String primeiroNome;
	
	String segundoNome;
	

	String telefone;
	
	String getNome() {
		return primeiroNome + " " + segundoNome;
	}
	
	void setNome(String nome) {
		String [] nomeCompleto = nome.split(" ");
		primeiroNome = nomeCompleto[0];
		segundoNome = nomeCompleto[1];
		
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
