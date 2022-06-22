package exercicio;

import java.util.Scanner;

public class CalcularTroco {

	public static void main(String[] args) {
		
		Scanner ler  = new Scanner(System.in);
		
		System.out.print("Digite o preço do Produto: ");
		double preco = ler.nextDouble();
		
		System.out.print("Digite o valor passado: ");
		double pessoa = ler.nextDouble();
		
		double resultado = pessoa - preco;
		
		System.out.println("o troco :" + resultado);
		
		ler.close();
	}

}
