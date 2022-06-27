package exercicio;

import java.util.Scanner;

public class CalculeBonusFuncionario {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	System.out.print("INFORME O FATURAMENTO ANUAL:");
	double faturamentoAnual = ler.nextDouble();
	
	System.out.print("INFORME O FATURAMENTO:");
	double faturamento = ler.nextDouble();
	
	System.out.print("INFORME O SALARIO DO FUNCIONARIO:");
	double salarioFauncionario = ler.nextDouble();
	
	double metaOiitoporcento = (faturamentoAnual * 80) / 100;
	
	boolean meta = faturamento >= faturamentoAnual ;
	
	boolean bonusSalarial = faturamento>= metaOiitoporcento;
	
	
	if(meta){
		System.out.println("VOCE GANHO UM BONUS SALARIAL DE 100%." + salarioFauncionario);
	
	}else if(bonusSalarial){
		double metaOitoPorCentodoSalarioanual = (metaOiitoporcento * 80) /100;
		
		System.out.println("Você vai ganhar um bônus de 80%! Ele será de: "  + metaOitoPorCentodoSalarioanual);
		
	}else {
		System.out.println("Infelizmente, esse ano não tem bônus!");
	}
	
	ler.close();
	}

}
