package exercicio;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x = ler.nextInt();
		
		for(int i=1; i<=x; i++) {
			if(i %2 != 0){
				System.out.println(i);
			}
			
		}
				ler.close();
	}
}
