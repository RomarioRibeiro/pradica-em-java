package primeiraclass;

public class PrimeiraClass {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Computador";
		produto.quantidadeProduto = 7;
		
		exibirQuantidade(produto);
		
	}
	static void exibirQuantidade(Produto produto) {
		System.out.println("o Produto " + produto.nome + " tem  " + produto.quantidadeProduto + " Unidade(s)");
	}
}
