package metodoinstancia;

public class Cliente {
	
	String primeiroNome;
	
	String segundoNome;
	
	String email;
	
	String telefone;
	
	
	String exibirNomeCompleto() {
		String nomeCompleto = primeiroNome + " "  + segundoNome;
		
		return nomeCompleto;
	}
	
	String exibirDDD() {
		String ddd = telefone.substring(0, 2);
		return ddd;
	}
	
}
