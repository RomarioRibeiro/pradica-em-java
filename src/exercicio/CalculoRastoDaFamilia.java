package exercicio;

import java.util.Scanner;

public class CalculoRastoDaFamilia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		
		System.out.print("INFORME O VAlOR DA LUZ:");
		double luz = ler.nextDouble();
		
		System.out.print("INFORME O VAlOR DA ÁGUA:");
		double agua = ler.nextDouble();
		
		System.out.print("INFORME O VAOR DO TELEFONE:");
		double telefone  = ler.nextDouble();
		
		System.out.print("INFORME O VAOR DA ESCOLA:");
		double escola  = ler.nextDouble();
		

		System.out.print("INFORME O VAOR DO SUPER MERCADO:");
		double superMercado  = ler.nextDouble();
		
		double soma = luz += agua += telefone += escola += superMercado;
		
		System.out.printf("SEU GASTO NO MÊS: %.2f%n", soma );
		
		
		ler.close();
	}

}
