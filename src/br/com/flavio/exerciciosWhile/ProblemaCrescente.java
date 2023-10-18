package br.com.flavio.exerciciosWhile;

import java.util.Scanner;

public class ProblemaCrescente {

	/*
	 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
	 * Escreva para cada X e Y uma mensagem que indique se estes valores foram
	 * digitados em ordem crescente ou decrescente. O programa deve finalizar quando
	 * forem digitados dois valores iguais.
	 */

	public static void main(String[] args) {

		int x = 0;
		int y = 1;

		Scanner sc = new Scanner(System.in);

		while (x != y) {

			System.out.println("Digite dois números: ");
			x = sc.nextInt();
			y = sc.nextInt();

			if (x < y) {
				System.out.println("CRESCENTE!");
			} else if (x > y) {
				System.out.println("DECRESCENTE!");
			} else {
				break;
			}

		}

		sc.close();

	}

}
