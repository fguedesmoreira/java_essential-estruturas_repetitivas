package br.com.flavio.exerciciosFor;

import java.util.Scanner;

public class ProblemaParImpar {

	/*
	 * Leia um valor inteiro N. Este valor será a quantidade de números inteiros que
	 * serão lidos em seguida. Para cada valor lido, mostre uma mensagem dizendo se
	 * este valor lido é PAR ou IMPAR, e também se é POSITIVO ou NEGATIVO. No caso
	 * do valor ser igual a zero (0), seu programa deverá imprimir apenas NULO.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números inteiros você vai digitar? ");
		int quantidade = sc.nextInt();

		for (int i = 0; i < quantidade; i++) {

			System.out.print("Digite um número: ");
			int numero = sc.nextInt();

			if (numero == 0) {
				System.out.println("NULO");
			} else if (numero % 2 == 0) {
				System.out.print("PAR ");
			} else {
				System.out.print("ÍMPAR ");
			}

			if (numero < 0) {
				System.out.println("NEGATIVO");
			} else if (numero > 0) {
				System.out.println("POSITIVO");
			}

		}
		
		sc.close();

	}

}