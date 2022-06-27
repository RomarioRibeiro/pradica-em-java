package exercicio;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("INFORME UM NÚMERO DE [1 ATE 7] PARA DIA DA SEMANA ");
		Integer dia = ler.nextInt();
		
		switch (dia) {
		case 1:System.out.println("DOMIGO");
			
			break;
		case 2:System.out.println("SEGUNDA-FEIRA");
		
		break;
		case 3:System.out.println("TERÇA-FEIRA");
		
		break;
		case 4:System.out.println("QUARTA-FEIRA");
		
		break;
		case 5:System.out.println("QUINTA-FEIRA");
		
		break;
		case 6:System.out.println("SEXTA-FEIRA");
		
		break;
		case 7:System.out.println("SÁBADO");
		
		break;

		default:
			System.out.println("CODIGO EM VALIDO!.");
			break;
		}
		
		ler.close();
	}

}
