package atividade01;

import java.util.Locale;
import java.util.Scanner;

public class exercicio {
	public static void main(String[] args) {
		float valorFinal;
		float salario;
		float valor;
		float taxa1;
		float taxa2;
		
		taxa1 = (float) (1000 * 0.08);
		taxa2 = (float) (1500 * 0.18);
		
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.ENGLISH);
		
		System.out.println("---- Valor do imposto de cada habitante  em Lisarb ----");
		System.out.println(" digite o valor seu salario em R$ \n");
		valor = ler.nextFloat();
		
		if (valor > 0 && valor <= 2000.00) {
		System.out.println("Morador não irá pagar  imposto a governo");
		
		}
		else if(valor >= 2000.01 && valor <= 3000.00) {
			valorFinal = (float) ((valor - 2000) * 0.08);
			System.out.printf("Devera ser pago um valor de R$ %.2f", valorFinal, "ao governo do País");
		
		}
		else if(valor >= 3000.01 && valor <= 4500.00) {
			valorFinal = (float) ((valor - 3000) * 0.18);
			salario = valorFinal + taxa1;
			System.out.printf("Devera ser pago um valor de R$ %.2f", salario , "ao governo do País");
			
		}
		else if (valor > 4500.00) {
			valorFinal = (float) ((valor - 4500) * 0.28);
			salario = valorFinal + taxa1 + taxa2;
			System.out.printf("Devera ser pago um valor de R$ %.2f", salario , "ao governo do País");
		}

	}
	}

