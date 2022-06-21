package exercicio;

import java.util.Scanner;

public class ExercicioWhilegasolina {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int alcool= 0;
		int gasolina = 0;
		int diesel = 0;
		
		int x;
		x= ler.nextInt();
		
		while(x != 4) {
			if(x == 1) {
				alcool = alcool + 1;
			}else if(x == 2) {
				gasolina = gasolina + 1; 
			}else if(x == 3) {
				diesel += 3; 
			}
				
				x= ler.nextInt();
			
			
		}
		
		System.out.println("OBRIGADO" + x);
		System.out.println("alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		ler.close();
	}

}
