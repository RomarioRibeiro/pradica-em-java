package main;

import java.util.Scanner;

public class RaioCirculo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double x ;
		double y;
		double soma;
		System.out.println("INFOMER OS NUMERO:");
		x = ler.nextDouble();
		y = ler.nextDouble();
	
		soma = x * y * y;
		System.out.printf("SOMA = %.4f%n", soma);
	}
}
