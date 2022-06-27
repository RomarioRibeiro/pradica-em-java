package exercicio;

import java.util.Scanner;

public class Aposentadoria {
	
	static final Integer IDADE_PARA_APOSENTAR = 55;
	static final Integer TEMPO_CONTRIBUIDO = 25;

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("INFORME SUA IDADE:");
		Integer idade = ler.nextInt();
		
		System.out.print("INFORME SEU TEMPO COMTRIBUIDO:");
		Integer contribuicao = ler.nextInt();
		
		
		
		boolean PodeAposentar = idade >= IDADE_PARA_APOSENTAR && contribuicao >= TEMPO_CONTRIBUIDO ;
		
		if(PodeAposentar){
			System.out.println("SIM! PODE APOSENTAR: ");
		} else {
			System.out.println("NÃO! PODE APOSENTAR ");
		}
			
		
		
		ler.close();
	}

}
