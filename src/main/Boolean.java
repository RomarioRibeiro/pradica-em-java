package main;

public class Boolean {

	public static void main(String[] args) {
		boolean variavelVedadeira = true;
		System.out.println("variavel Vedadeira " + variavelVedadeira);

		boolean variavelFalsa = false;
		System.out.println("Varivel falsa " + variavelFalsa);

		System.out.println("------------------------------------------");

		int idade = 18;

		boolean tirarCateira = idade >= 18;

		if (tirarCateira) {
			System.out.println("Sim! ele(a) Pode Tirar a Carteira!");
		} else {
			System.out.println("Não! ele(a) não pode Tirar a Cateira");
		}
	}

}
