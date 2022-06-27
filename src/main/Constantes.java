package main;

import java.util.Scanner;

public class Constantes {
	
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTERIRA = 18;


	public static void main(String[] args) {
		Scanner ler  = new Scanner(System.in);
		
		// final Integer idadeMinimaParaTirarCarteira = 18;
		
				System.out.print("Idade: ");
				Integer idade = ler.nextInt();
				
				boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTERIRA;
				
				if (podeTirarCarteira) {
					System.out.println("Sim! Ele(a) pode tirar carteira.");
				} else {
					System.out.println("N�o! Ele(a) n�o pode tirar carteira.");
				}
		
		
		ler.close();
	}

}