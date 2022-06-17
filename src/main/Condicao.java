package main;

import java.util.Scanner;

public class Condicao {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		int  x;
			
		System.out.println("INFORME UM NÚMERO");
		x = ler.nextInt();
		
		if(x % 2 == 0){
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		ler.close();
	}

}
