package main;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		boolean tresMaiorQueDois = 3 > 2;
		System.out.println("3 > 2? " + tresMaiorQueDois);
		
		boolean tresMenorQueDois = 3 < 2;
		System.out.println("3 < 2? " + tresMenorQueDois);
		
		boolean tresMaiorQueTres = 3 > 3;
		System.out.println("3 > 3? " + tresMaiorQueTres);
		
		boolean tresMaiorOuIgualATres = 3 >= 3;
		System.out.println("3 >= 3? " + tresMaiorOuIgualATres);
		
		boolean tresMenorOuIgualATres = 3 <= 3;
		System.out.println("3 <= 3? " + tresMenorOuIgualATres);
		
		boolean doisIgualADois = 2 == 2;
		System.out.println("2 == 2? " + doisIgualADois);
		
		boolean doisDiferenteDeDois = 2 != 2;
		System.out.println("2 != 2? " + doisDiferenteDeDois);
		
		Integer quatro = 4;
		boolean quatroMaiorQueQuatro = quatro > quatro;
		System.out.println("quatro > quatro? " + quatroMaiorQueQuatro);
		
		boolean quatroMaiorOuIgualAQuatro = quatro >= quatro;
		System.out.println("quatro >= quatro? " + quatroMaiorOuIgualAQuatro);
		
		Integer cinco = 5;
		boolean cincoIgualACinco = cinco.equals(cinco);
		System.out.println("cinco.equals(cinco)? " + cincoIgualACinco);
		
		Integer seis = 6;
		boolean cincoIgualASeis = cinco.equals(seis);
		System.out.println("cinco.equals(seis)? " + cincoIgualASeis);
		
		Integer centoVinteOito = 128;
		Integer centoVinteOito02 = 128;
		boolean centoVinteOitoIgualCentoVinteOito = centoVinteOito.equals(centoVinteOito02);
		System.out.println("centoVinteOito.equals(centoVinteOito02)? " + centoVinteOitoIgualCentoVinteOito);
				
		// Notas importantes de se lembrar sobre o operador "==":
		//    * O Java s� consegue comparar os tipos normais, atrav�s do operador "==", com n�meros que 
		//	est�o no intervalo de "-128" at� "127". Fora desse intervalo, o operador "==" pode causar muita 
		//  confus�o quando utilizado com os tipos normais. Utilizado juntamente com os primitivos (que, 
		//  nesse caso, seria o "int" ao inv�s de "Integer") o operador "==" funciona para qualquer n�mero.
		//    * Caso voc� utilize a mesma vari�vel, o operador "==" vai funcionar at� para os tipos 
		//  normais. Isso porque o valor de uma vari�vel sempre ser� igual a ele mesmo. Repare que, em nosso 
		//  exemplo, utilizamos duas vari�veis com o mesmo valor, pois, isso � o que acontece no "mundo real".
		boolean centoVinteOitoIgualCentoVinteOito02 = centoVinteOito == centoVinteOito02; 
		System.out.println("centoVinteOito == centoVinteOito02? " + centoVinteOitoIgualCentoVinteOito02);

	}

}
