package br.com.flavio.exerciciosFor;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExperiencias {

	/*
	 * Maria acabou de iniciar seu curso de graduação na faculdade de medicina e
	 * precisa de sua ajuda para organizar os experimentos de um laboratório do qual
	 * ela é responsável. Ela quer saber no final do ano, quantas cobaias foram
	 * utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
	 * Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e
	 * coelhos. Para obter estas informações, ela sabe exatamente o número de
	 * experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade
	 * de cobaias utilizadas em cada experimento. Faça um programa que leia um valor
	 * inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de
	 * teste contém um inteiro que representa a quantidade de cobaias utilizadas e
	 * uma letra ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo
	 * C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de
	 * cobaia utilizada e o percentual de cada uma em relação ao total de cobaias
	 * utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após
	 * o ponto.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos casos de teste serão digitados? ");
		int quantidadeDeCasos = sc.nextInt();

		int ratos = 0;
		int sapos = 0;
		int coelhos = 0;

		for (int i = 0; i < quantidadeDeCasos; i++) {

			System.out.print("Quantidade de cobaias: ");
			int quantidadeDeCobaias = sc.nextInt();

			System.out.print("Tipo de cobaia: ");
			char tipoDeCobaia = sc.next().charAt(0);

			if (tipoDeCobaia == 'C' || tipoDeCobaia == 'c') {
				coelhos += quantidadeDeCobaias;
			} else if (tipoDeCobaia == 'R' || tipoDeCobaia == 'r') {
				ratos += quantidadeDeCobaias;
			} else if (tipoDeCobaia == 'S' || tipoDeCobaia == 's') {
				sapos += quantidadeDeCobaias;
			}

			System.out.println("");

		}

		sc.close();

		System.out.println("RESULTADO FINAL:");
		System.out.printf("Total: %d cobaias%n", coelhos + ratos + sapos);
		System.out.printf("Total de COELHOS: %d%n", coelhos);
		System.out.printf("Total de RATOS: %d%n", ratos);
		System.out.printf("Total de SAPOS: %d%n", sapos);
		System.out.printf("Percentual de COELHOS: %.2f%n",
				((double) coelhos / (double) (coelhos + ratos + sapos)) * 100.0);
		System.out.printf("Percentual de RATOS: %.2f%n", ((double) ratos / (coelhos + ratos + sapos)) * 100.0);
		System.out.printf("Percentual de SAPOS: %.2f%n", ((double) sapos / (coelhos + ratos + sapos)) * 100.0);

	}

}