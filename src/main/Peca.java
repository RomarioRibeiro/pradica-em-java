package main;

import java.util.Scanner;

public class Peca {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int peca1,peca2,quant1,quant2;
		double preco1,preco2,soma;
		
		peca1 = ler.nextInt();
		quant1 = ler.nextInt();
		preco1= ler.nextDouble();

		
		peca2 = ler.nextInt();
		quant2 = ler.nextInt();
		preco2 = ler.nextDouble();
		
		soma = preco1 * quant1 + preco2 * quant2;
		
		System.out.printf("VALOR A PAGAR = %.2f%n", soma);
		
	}
	
}
