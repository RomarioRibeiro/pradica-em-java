package exercicio;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("DIDGITE UM NUMERO: ");
		Integer numero =ler.nextInt();
				
		tabuada(numero, 0);
		ler.close();
	}
	
	static void tabuada(Integer tabuadas , Integer i ) {
		System.out.println( tabuadas + " x " + i + " = "  + (tabuadas * i));
		
		if(++i < 10) {
			tabuada(tabuadas, i);
		}
	}
	


}
