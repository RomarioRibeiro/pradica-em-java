package console;

import java.util.Scanner;

public class Interacao {
	Scanner ler = new Scanner(System.in);
	
	public Integer lerNumero(String texto) {
		System.out.println(texto);
		return ler.nextInt();
	}
	
	
	public double lerDicimal(String texto) {
		System.out.println(texto);
		return ler.nextDouble();
	}
	
	public String lerLinha(String texto) {
		System.out.println(texto);
		return ler.nextLine();
	}
	
	public void fechar() {
		ler.close();
	}

	public void  imprimir(String texto) {
		System.out.println(texto);
		
	}
	
	public void  erro(String texto) {
		System.err.println(texto);
		
	}
	
}
