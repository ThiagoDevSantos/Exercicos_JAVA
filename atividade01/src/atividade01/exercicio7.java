package atividade01;
import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.ENGLISH);

		float nota1, nota2, media;

		System.out.printf("Digite a primeira nota do aluno :");
		nota1 = ler.nextFloat();

		if (nota1 >= 0 && nota1 <= 10) {
			System.out.printf("Digite a segunda nota do aluno : ");
			nota2 = ler.nextFloat();
			if (nota2 >= 0 && nota2 <= 10) {
				media = (nota1 + nota2) / 2;
				System.out.printf("A Media do aluno = %.2f", media);
			} else {
				System.out.printf("Nota Invalida, só notas entre 0 e 10 serã permitidas!");
			}
		} else {
			System.out.printf("Nota Invalida, só notas entre 0 e 10 serã permitidas!");
		}
	}

}
