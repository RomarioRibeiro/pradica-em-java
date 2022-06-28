package metodoinstancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Romário";
		cliente.segundoNome = "Ribeiro";
		cliente.telefone = "4399999999";
		
		System.out.println("Nome do Cliente: " + cliente.exibirNomeCompleto());
		System.out.println("DDD : " + cliente.exibirDDD());
		
	}

}
