package algoritimoavandi;

public class ListaAluno {
	final static int QUANTIDADE_DA_LISTA = 2;
	
	
	Aluno [] lista = new Aluno [QUANTIDADE_DA_LISTA];
	
	int tamnahoLista = 0;
	
	public Aluno obter(int indice) {
		return lista[indice];
	}
	
	public int tamanho() {
		return tamnahoLista;
	}
	
	
	
	public void adicionar (Aluno aluno) {
		if(tamnahoLista == lista.length){
		Aluno[] novalista = new Aluno[QUANTIDADE_DA_LISTA + lista.length];
		
		for(int i = 0; i< lista.length; i++) {
			novalista[i] = lista[i];
		}
		lista = novalista;
		}
		lista[tamnahoLista] = aluno;  
		tamnahoLista++;
	}
	
	void remover(Aluno aluno) {
	for(int i = 0; i< tamnahoLista; i++) {
		Aluno a = lista[i];
		if(a != null && a.equals(aluno)){
			remover(i);
			break;
		}else if (a == null && aluno == null) {
			remover(i);
			break;
		}
	}
	
	}

	void remover(int indice) {
		int indiceInicial = indice + 1;
		
		for(int i = indiceInicial; i < indice ; i++) {
			lista[i - 1] = lista[i]; 
		}
		tamnahoLista--;
		lista[tamnahoLista] = null;
	}
	
 public	void ordenar(){
		for(int i = 0; i< tamnahoLista; i++) {
			Aluno alunoPosicaoBase = lista[i];
			
			int indicePosicaoBase = i;
			
			while(indicePosicaoBase > 0) {
				int indicePosicaoAnterior = indicePosicaoBase - 1;
				Aluno alunoPosicaoAnterior = lista[indicePosicaoAnterior];
				
				Boolean alunoPosicaoAnteriorVEmDepois = alunoPosicaoAnterior == null
						|| alunoPosicaoAnterior.vemDepoisDe
						(alunoPosicaoBase);
				if(alunoPosicaoAnteriorVEmDepois) {
					lista[indicePosicaoBase] = lista[indicePosicaoAnterior];
					
					indicePosicaoBase--;
				}else {
					break;
				}
				
			}
			lista[indicePosicaoBase] = alunoPosicaoBase;
		}
	}
	
}
