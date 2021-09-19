package atividade01;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.ENGLISH);

		int contador, quantidade, total, totalAnimais, somaCoelho = 0 , somaRato = 0 , somaSapo = 0 ;
		String opcao;
		float percentualCoelho,percentualRato, percentualSapo;
		
		System.out.println("digite a quantidade de linhas");
		total = ler.nextInt();
		
		if (total >= 1 && total <= 15) {
			for(contador = 1; contador <= total; contador++) {
				System.out.println("quantos animais deseja cadastrar");
				quantidade = ler.nextInt();
				System.out.println("-------------------------------------");
				System.out.println("Qual o tipo do animal");
				System.out.println("digite C para coelho");
				System.out.println("digite R para rato");
				System.out.println("digite S para sapo");
				opcao = ler.next();
				
				switch (opcao) {
				case  "C" :
					somaCoelho = somaCoelho + quantidade;
					break;
				case  "R" :
					somaRato = somaRato + quantidade;
					break;
				case  "S" :
					somaSapo = somaSapo + quantidade;
					break;
				default:
					break;
				}
				
			}
			totalAnimais = somaCoelho + somaRato + somaSapo;
			percentualCoelho = (somaCoelho * 100) / totalAnimais;
			percentualRato = (somaRato * 100) / totalAnimais;
			percentualSapo =(somaSapo * 100) / totalAnimais;
			System.out.println("Total: " + totalAnimais + " cobaias");
			System.out.println("------------------------------------");
			System.out.println("Total de coelhos: " + somaCoelho + "\n");
			System.out.println("Total de ratos: " + somaRato + "\n");
			System.out.println("Total de sapos: " + somaSapo);
			System.out.println("------------------------------------");
			System.out.println("Percentual de coelhos: " + percentualCoelho + "%" +  "\n");
			System.out.println("Percentual de ratos:  "  + percentualRato + "%" + "\n");
			System.out.println("Percentual de coelhos: " +  percentualSapo + "%" );
			
		}else {
		
		System.out.println("entrada incorreta!");
	}

}
}