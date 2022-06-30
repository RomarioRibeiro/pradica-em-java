package algoritimoavandi;

public class AlgoritimoAvando {

	public static void main(String[] args) {
		ListaAluno lista = new ListaAluno();

		Aluno aluno1 = new Aluno();
		aluno1.nome = "Romario";
		lista.adicionar(aluno1);

		Aluno aluno2 = new Aluno();
		aluno2.nome = "Matheus";
		lista.adicionar(aluno2);

		Aluno aluno3 = new Aluno();
		aluno3.nome = "Vinicios";
		lista.adicionar(aluno3);

		Aluno aluno4 = new Aluno();
		aluno4.nome = "Ramon";
		lista.adicionar(aluno4);

		crud(lista);

		lista.ordenar();

		crud(lista);

		lista.remover(aluno3);

		crud(lista);

	}

	static void crud(ListaAluno lista) {

		for (int i = 0; i < lista.tamanho(); i++) {
			Aluno a = lista.obter(i);

			if (a != null) {
				System.out.println("Aluno " + a.nome);

			} else {
				System.out.println("Sem nome.. ");
			}

		}

		System.out.println("----------------------------------");
	}

}
