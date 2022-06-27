package exercicio;

import java.util.Scanner;

public class CalculoDeFrete {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		
	System.out.print("INFORME O VALOR DO PRODUTO:");
	double preco = ler.nextDouble();
	
	double soma = preco + 15.00;
	
	boolean freteMaiorQue = soma >=100;
	
	if(freteMaiorQue){
		System.out.println("FRETE GRATIS: " + soma);
	}else {
		System.out.println("SEU FRETE E DE :" + soma);
	}
	ler.close();
	}

}
