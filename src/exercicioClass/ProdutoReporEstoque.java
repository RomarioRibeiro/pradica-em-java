package exercicioClass;

import java.util.Scanner;

public class ProdutoReporEstoque {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Produto produto = new Produto();
		produto.nome = "Computadores";
		produto.quantidadeEstoque = 20;
		
		mostarEstoqueParaRepor(produto, ler);
		
		ler.close();
	}
	
	static void mostarEstoqueParaRepor(Produto produto, Scanner ler) {
		System.out.print("quantos vc vaai tirar? ");
		Integer quantidade = ler.nextInt();
		
		Integer resultado = produto.quantidadeEstoque - quantidade ;
		
		boolean temNoEstoque = resultado >= 10 ;
		
		if(temNoEstoque){
			System.out.println("Estoque tem: " + resultado);
		}else{
			System.out.println("Atenção! Seu Estoque está Baixo!." + resultado + " Unidade(s)");
		}
	}
}
