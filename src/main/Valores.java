package main;

import java.util.Scanner;

public class Valores {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a,b,c,d, soma;
		
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		d = ler.nextInt();
		
		soma = (a*b - c*d);
		
		System.out.println("Diferencia: " + soma);
	}
		
}
