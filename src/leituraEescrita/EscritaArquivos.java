package leituraEescrita;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		for(int i =0; i< 3; i++) {
			System.out.println("Convidados " + i + ":");
			String nome = ler.nextLine();
			
			linhas.add(nome);
			
		}
		
		Path arquivos = Paths.get("C:/Users/Super Copo/temp/arquivo.txt");
		Files.write(arquivos, linhas);
		
		ler.close();
		System.out.println("Fim....");
	}

}
