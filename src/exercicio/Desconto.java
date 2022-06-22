package exercicio;

import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
	
		
	Scanner ler = new Scanner(System.in);
	
	System.out.print("Digite um Valor: ");
	
	int valor = ler.nextInt();
	
	System.out.print("Digite o quantidade: ");
	int quantidade = ler.nextInt();
	
	int subtotal = valor * quantidade;
	
	Boolean vaiTemDEsconto = quantidade >=10;
	
	double desconto = 0.0;
	if(vaiTemDEsconto) {
		desconto = 10.0;
		
	}
	
	double acrecimo = subtotal * desconto /100 ;
	
	double resultado = subtotal- acrecimo ;
	
	System.out.println("o subtotal :" + resultado);
	
	ler.close();
	}

}
