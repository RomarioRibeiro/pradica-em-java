package main;

import java.util.Scanner;

public class Cartapio {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
	
		
		int codigo, quantidade ;
		
		double resultado ;
		
		codigo = ler.nextInt();
		quantidade = ler.nextInt();
		if(codigo == 1){
			resultado = quantidade * 5.0;
		}
		else if(codigo == 2) {
			resultado = quantidade * 4.5;
		}
		else {
			resultado = quantidade * 1.5;
		}
		
		
		System.out.printf("VALOR APAGAR: R$ %.2f%n", resultado);
		
		
		ler.close();
		
	}
}
