package atividade01;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.ENGLISH);
		
		int contador, soma,valorX, valorY, valorW;
		
		System.out.println("Digite o valor  de X");
		valorX =  ler.nextInt();
		
		System.out.println("Digite o valor  de Y");
		valorY =  ler.nextInt();
		
		if(valorY < valorX) {
		valorW = valorX;
		valorX = valorY;
		valorY = valorW;
		

		}
		soma = 0;
		
		for (contador = (valorX + 1) ; contador < valorY ; contador++) {
			if (contador % 2 != 0) {
				soma += contador;
			}
		}
		
		System.out.println("a soma dos valores impares é " + soma);
}
}
