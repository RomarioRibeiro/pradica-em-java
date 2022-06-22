package exercicio;

import java.util.Scanner;

public class CalculoQuadrado {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a Lagura do quadrado: ");
		int quadrado = ler.nextInt();
		
		int resultado = quadrado * quadrado;
		
		System.out.println("o numero do quadrado e:" + resultado);
		
		ler.close();
	}

}
