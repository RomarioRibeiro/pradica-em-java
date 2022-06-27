package exercicio;

import java.util.Scanner;

public class ConcursoPublico {
	static final Integer NOTA_MAXIMA_PARA_PASSAR = 150;
	static final Integer NOTA_MINIMA_PARA_PASSAR = 60;
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("INFORME A NOTA DE PORTUGUÊS:");
		Integer notaPortugues = ler.nextInt();
		
		System.out.print("INFORME A NOTA DE MATEMÁÍCA:");
		Integer notaMatematica = ler.nextInt();
		
		
		
		boolean notaMaiorOuIgualASecenta01 = notaPortugues >= NOTA_MINIMA_PARA_PASSAR;
		
		boolean notaMaiorOuIgualASecenta02 = notaMatematica >= NOTA_MINIMA_PARA_PASSAR;
		
		double somaDeNotas = notaPortugues + notaMatematica;
		
		
		boolean notaTotal = somaDeNotas >= NOTA_MAXIMA_PARA_PASSAR;
		
		boolean notaParaPassar = notaMaiorOuIgualASecenta01 && notaMaiorOuIgualASecenta02 && notaTotal;
		
		
		if(notaParaPassar) {
			System.out.println("SIM! PASSOU NO CONCURSO.");
		}else {
			System.out.println("NÃO! PASSOU NO CONCURSO.");
		}
		
		ler.close();
	}

}
