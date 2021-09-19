package atividade01;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.ENGLISH);
		
		int contador, numero;
		
		System.out.println("digite o numero desejado");
		numero = ler.nextInt();
		
		if(numero >= 1 && numero <= 1000) {
			for(contador = 1; contador <= numero; contador++) {
				if((contador % 2) != 0) {
					System.out.println("os valores impares são " + contador);
				}
			}
		}else {
		
		System.out.println("entrada incorreta");
	}

}
}
