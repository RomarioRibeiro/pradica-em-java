package main;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner  ler = new Scanner(System.in);
		
		int x = ler.nextInt();
		String dia;
		
	switch(x) {
			case 1:
			dia = "domigo";
			break;
			
			case 2:
				dia = "segunda ";
				break;
				
			case 3:
				dia = "terça-feira";
				break;
			case 4:
				dia = "quarta-feira";
				break;
			case 5:
				dia = "quinta-feira";
				break;
			case 6:
				dia = "sexta-feira";
				break;
			case 7:
				dia = "sábado";
				break;
				
			default:
				dia = "dia Invalido";
		}
		
		System.out.println("DIA DA SEMANA: " + dia);
		
		ler.close();
	}
	
	
}
