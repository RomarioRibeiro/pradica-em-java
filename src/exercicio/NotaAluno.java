package exercicio;

import java.util.Scanner;

public class NotaAluno {
	
	static final Integer NOTA_FINAL_DO_ALUNO = 5;
	public static void main(String[] args) {
		Scanner ler  = new Scanner(System.in);
		
		System.out.print("Infome a nota:");
		Integer nota = ler.nextInt();
				
		boolean notaBimestral = nota >= NOTA_FINAL_DO_ALUNO;
		
		if (notaBimestral){
			System.out.println("O aluno Passou!");
		}else{
			System.out.println("O aluno Reprovou! ");
		}
		ler.close();
	}

}
