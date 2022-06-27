package exercicio;

import java.util.Scanner;

public class CadastroDeTarefas {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String [] tarefas = new String[5];
		
		
		
		for(int i = 0; i < tarefas.length; i++) {

			System.out.println("INFORM SUA TAREFAS DIARIA?");
			tarefas[i] = ler.nextLine();
		}

		System.out.println("SUA TAREFA SÃO:");
		for(int i = 0; i < tarefas.length; i++){
		System.out.println("[" + i + "]" + tarefas[i]);
			
		}
		ler.close();		
	}

}
