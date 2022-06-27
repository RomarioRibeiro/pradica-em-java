package exercicio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("INFOME O NUMERO:");
		Integer numero1 = ler.nextInt();
		
		System.out.print("Infome a Operação desejada:");
		Integer operador = ler.nextInt();
		
		System.out.println("Infome o Segundo Número:");
		Integer numero2 =  ler.nextInt();
		
		
		
		
		double operador01 = 0.0;
		if(operador.equals(1)){
			operador01 = numero1 + numero2;
		}
		
		if(operador.equals(2)){
			operador01 = numero1 - numero2;
		}
		
		if(operador.equals(3)) {
			operador01 = numero1 * numero2;
			
		}
		
		if(operador.equals(4)){
			operador01 = numero1 / numero2;
		}
		
		System.out.println("seu resultado:" + operador01);
 		
		ler.close();
	}

}
