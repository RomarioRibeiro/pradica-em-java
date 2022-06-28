package exerciciometodo;

public class ProdutoEstoque {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Computador Game";
		produto.quantidadeEstoque = 8 ;
		
		System.out.println("Seu Estoque: " + produto.exibirEstoque());
		
	}
}
