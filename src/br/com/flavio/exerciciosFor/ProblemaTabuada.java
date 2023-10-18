package br.com.flavio.exerciciosFor;

import java.util.Scanner;

public class ProblemaTabuada {

	/*
	 * Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10,
	 * conforme exemplo.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Deseja a tabuada de qual valor? ");
		int valor = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.printf("%d X %d = %d%n", valor, i, valor * i);

		}

		sc.close();

	}

}