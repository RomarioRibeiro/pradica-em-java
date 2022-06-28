package exerciciometodo;

public class Produto {
	
	String nome;
	
	Integer quantidadeEstoque;
	
	Integer exibirEstoque() {
		Integer estoqueParaRepor = quantidadeEstoque;
		
		if(estoqueParaRepor > 10) {
			System.out.println("Estoque normal:");
		}else{
			System.out.println("Repor Estoque:");
		}
		
		return estoqueParaRepor;
		
	}
	
	
}
