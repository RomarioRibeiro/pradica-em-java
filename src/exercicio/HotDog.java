package exercicio;

import java.util.Scanner;

public class HotDog {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		int preco, quantidade;
		double soma;
		
		preco = ler.nextInt();
		quantidade = ler.nextInt();
		
		if(preco == 1) {
			soma = quantidade * 5.0  + 5;
		}else if(preco == 2) {
			soma = quantidade  * 27.80 + 5 ;
			
			
		}else{
			soma = quantidade * 4.00;
 		}
		
		System.out.printf("SEU PEDIDO FICARA EM: %.2f%n", soma);
		
		
		ler.close();
	}

}
