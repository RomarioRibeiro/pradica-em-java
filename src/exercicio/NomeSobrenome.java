package exercicio;

import java.util.Scanner;

public class NomeSobrenome {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seu nome");
		
		String nome = ler.nextLine();
		
		System.out.println("Digite seu Sobrenome: ");
		
		String sobrenome = ler.nextLine();
		
		
		System.out.println("Seja Bem Vindo " + nome + " " +  sobrenome + "!");
		
		ler.close();
	}

}
