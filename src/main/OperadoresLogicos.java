package main;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean carrinhoMaiorQue100 = false;
		boolean periodoDePromocao = true;
		boolean jaFezCompraNaLoja = true;
		boolean pagamentoAVista = true;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
		
//		Boolean aplicarDesconto = periodoDePromocao && carrinhoMaiorQue100 && jaFezCompraNaLoja;
		
//		Boolean aplicarDesconto = periodoDePromocao || carrinhoMaiorQue100 || jaFezCompraNaLoja;
		
		boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAVista;
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto.");
		} else {
			System.out.println("Não aplique o desconto.");
		}
		
		
	}

}
