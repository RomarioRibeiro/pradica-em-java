package exercicio;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		
		int horaInicial, horaFinal;
		
		System.out.print("INFOME AS HORAS INICIAL: ");
		horaInicial = ler.nextInt();
		
		System.out.print("INFOME AS HORAS FINAL: ");
		horaFinal = ler.nextInt();
		
		int duracao;
		
		if(horaInicial  < horaFinal){
			duracao = horaFinal - horaInicial;
			
		}
		else {
			duracao = 24 -  horaInicial + horaFinal;
		}
		
		System.out.println("JOGO DUROU " + duracao + "HORA (S)");
		
		ler.close();
		
	}

}
