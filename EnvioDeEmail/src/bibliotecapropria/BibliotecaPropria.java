package bibliotecapropria;

import console.Interacao;

public class BibliotecaPropria {

	public static void main(String[] args) {
		
		Interacao interecao = new Interacao();
		
		Integer numero = interecao.lerNumero("Digite um Número :");
		interecao.imprimir("Numero " + numero);
		
		double dimal = interecao.lerDicimal("Digite um Número Dicimal:");
		interecao.lerDicimal("Dicimal " + dimal);
		
		interecao.erro("Uma Messagem de Erro!.");
		
		interecao.fechar();
		
	}

}
