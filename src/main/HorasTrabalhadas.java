package main;

import java.util.Scanner;

public class HorasTrabalhadas {

	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int funcionario;
		double horas;
		double trablhadas;
		double soma;
		
		System.out.println("Infome sua numero:");
		funcionario = ler.nextInt();
		
		System.out.println("Informe suas Horas: ");
		horas = ler.nextDouble();
		
		System.out.println("Infome seu salario: ");
		trablhadas = ler.nextDouble();
		
		soma = horas * trablhadas;
		
		System.out.println("NUMBER: " + funcionario);
		System.out.printf("SALARY: u$ %.2f%n", soma);
	}
}
