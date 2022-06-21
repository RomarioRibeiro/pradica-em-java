package main;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		//while so para com quando o valor for falso 
		// while funciona assim verdade exculta e volta e se for falso ele pula fora 
		
		Scanner ler = new Scanner(System.in);
		int x;
		
		int soma = 0;
		
		x = ler.nextInt();
		
		while(x != 0) {
			soma += x;
			x = ler.nextInt();
		}
		
		System.out.println(soma);
		
		ler.close();
	}

}
