package atividade01;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		float numero, media, numeroPositivo = 0;
		int  positivo; 
		
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.ENGLISH);
		
		positivo = 0;
		
		for(int contador = 1; contador <= 6 ; contador++) {
			System.out.println("digite um numero");
			numero = ler.nextFloat();
			
				if(numero > 0) {
					positivo++;
					numeroPositivo = numeroPositivo + numero;
				}
			
		}
		
		System.out.printf("a quantidade de numeros positivos é %d", positivo );
		media = numeroPositivo/positivo;
		
		System.out.printf("\n O  valor da media dos mesmo é %.1f", media );
		
		
	}

}
