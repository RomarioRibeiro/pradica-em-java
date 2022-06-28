package exercicioListaarquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaAtividade {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> lista = new ArrayList<String>();
		
		String atividade = "";
		int i = 0;
		
		while(true)  {
			
			System.out.println("Para sair Aperte (x) ");
			System.out.print("Inform sua Atividade de Hoje: " + i + ":");
			atividade = ler.nextLine();
			
			if("x".equals(atividade)) {
				break;
			}
			lista.add(atividade);
			i++;
		}
		
		Path arquivos = Paths.get("C:/Users/Super Copo/temp/arquivo.txt");
		Files.write(arquivos, lista);
		
		ler.close();
		System.out.println("Fim...");
	}

}
