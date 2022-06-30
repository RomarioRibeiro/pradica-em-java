package exercicioordenar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ArquivosEmOrdem {

	public static void main(String[] args) throws IOException {
		Path arquivos = Paths.get("C:/Users/Super Copo/temp/arquivo.txt");
		Files.readAllLines(arquivos);

		List<String> linhas = Files.readAllLines(arquivos);
	

		for (int i = 0; i < linhas.size(); i++) {

			String nome = linhas.get(i);

			System.out.println("Ordenar " + nome);
		}
	}
}
