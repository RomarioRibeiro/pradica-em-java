package exercicio;
import java.util.Scanner;

public class CalculadoraCOmMetodo {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		imprimir("INFORME UM NUMEREO: ");
		Integer numero01 = ler.nextInt();
		
		imprimir("INFORME UM FORMULA ADICAO OU SUBTRACAO: ");
		Integer calcular = ler.nextInt();
		
		imprimir("INFORME UM NUMEREO: ");
		Integer numero02 = ler.nextInt();
		
		if(calcular.equals(1)){
			subtracao(numero01, numero02);
			imprimir("SEU RESULTADO: " + subtracao(numero01, numero02) );
		} else if(calcular.equals(2)){
			adicao(numero01, numero02);
			imprimir("SEU RESULTADO: " + adicao(numero01, numero02));
		}else{
			imprimirln("CODIGO INVALIDO!.");
		}
		
		ler.close();
	}
	
	static void imprimir(String texto){
		System.out.print(texto);
	}
	static void imprimirln(String texto) {
		System.out.println(texto);
	}
	
	static Integer subtracao(int numero01, int numero02) {
	 int	resultado = numero01 +  numero02;
		return resultado;
	}
	static Integer adicao(int numero01, int numero02) {
	int	resultado = numero01 - numero02;
		
		return resultado;
	}
}
