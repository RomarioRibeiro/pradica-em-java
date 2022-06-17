package main;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		int x,y;
		
		
		
		System.out.println("INFORME O NÚMERO");
		x = ler.nextInt();
		
		System.out.println("INFORME O NÚMERO");
		y = ler.nextInt();
		
		
		if(x % y == 0 || y % x == 0){
			System.out.println("sao multiplos ");
		}
		else {
			System.out.println("nao sao multiplos");
		}
		
		
		ler.close();
	}

}
