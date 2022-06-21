package exercicio;

import java.util.Scanner;

public class Cartel {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x = ler.nextInt();
		
		double soma = 0;

		if(x == 1) {
			double valor1 = ler.nextDouble();
			
			soma = soma + valor1 /2;
			
		}else if(x == 2) {
			double valor2 = ler.nextDouble();
			soma = valor2 * 3 / 10;
		}
		
		System.out.printf("valor a passar e: %.2f%n" , soma);
		
		ler.close();
	}
	
}
