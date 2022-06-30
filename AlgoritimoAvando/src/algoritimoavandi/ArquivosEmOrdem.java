package algoritimoavandi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import algoritimoavandi.Aluno;
import algoritimoavandi.ListaAluno;

public class ArquivosEmOrdem {

	public static void main(String[] args) throws IOException {
		Path arquivos = Paths.get("C:/Users/Super Copo/temp/nomes.txt");
		

		List<String> nomes = Files.readAllLines(arquivos);
		
		ListaAluno listaAluno = new ListaAluno();

		for (int i = 0; i < nomes.size(); i++) {

			String nome = nomes.get(i);
			
			Aluno aluno = new Aluno();
			
			aluno.nome = nome;
			
			
			listaAluno.adicionar(aluno);
			
	
		}
		listaAluno.ordenar();
		
		
		
	}
}
