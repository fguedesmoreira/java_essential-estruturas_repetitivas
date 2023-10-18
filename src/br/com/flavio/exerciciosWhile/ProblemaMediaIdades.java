package br.com.flavio.exerciciosWhile;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMediaIdades {

	/*
	 * Faça um programa para ler um número indeterminado de dados, contendo cada um,
	 * a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém
	 * um valor de idade negativa. Calcular e imprimir a idade média deste grupo de
	 * indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a
	 * mensagem "IMPOSSIVEL CALCULAR".
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int quantidadeIdades = 0;
		int somaIdades = 0;

		System.out.println("Digite as idades: ");

		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();

		while (idade >= 0) {

			quantidadeIdades++;
			somaIdades += idade;

			idade = sc.nextInt();

		}

		sc.close();

		System.out.printf("%nQuantidade de idades lidas: %d", quantidadeIdades);

		if (quantidadeIdades == 0) {
			System.out.printf("%nImpossível calcular!");
		} else {
			System.out.printf("%nMédia = %.2f", (double) somaIdades / quantidadeIdades);
		}

	}

}
