package encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
//		cliente.primeiroNome = "Romário";
//		cliente.segundoNome = "Ribeiro";
//		
		
		cliente.setNome("Romario Ribeiro");
		
		System.out.println("Nome do Cliente: " + cliente.getNome());
		System.out.println("Nome do Cliente: " + cliente.getPrimeiroNome());
		System.out.println("Segundo Nome do Cliente: " + cliente.getSegundoNome());
		
		
		
	}

}
