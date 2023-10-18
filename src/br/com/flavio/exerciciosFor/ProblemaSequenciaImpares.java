package br.com.flavio.exerciciosFor;

import java.util.Scanner;

public class ProblemaSequenciaImpares {

	/*
	 * Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor
	 * por linha, inclusive o X, se for o caso.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de X: ");
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}