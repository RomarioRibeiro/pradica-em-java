package exercicio;

public class DivisorWhile {

	public static void main(String[] args) {
		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };		
		int  numero= 0;
		
		while (numero < numeros.length) {
	
				if(numero %3 == 0){
					
					System.out.println("OS N�MEROS " + + numero + " DIVIDIDOS POR 3 " );
				}
				numero++;
			
			
			
		}
	}

}
