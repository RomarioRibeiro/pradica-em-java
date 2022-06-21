package exercicio;

import java.util.Scanner;

public class ExercicoWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int senha ;
		senha= ler.nextInt();
		
		while(senha != 2002 ) {
				System.out.print("senha invalida ");
				senha = ler.nextInt();
		}
		
		System.out.println("senha valida " + senha);
		
		ler.close();
	}
	
}
