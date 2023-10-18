package br.com.flavio.exerciciosFor;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaDivisao {

	/*
	 * Escreva um algoritmo que leia um número inteiro N, e depois repita N vezes:
	 * ler dois números e imprimir o resultado da divisão do primeiro pelo segundo.
	 * Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos casos você vai digitar? ");
		int quantidade = sc.nextInt();

		for (int i = 0; i < quantidade; i++) {

			System.out.print("Informe o numerador: ");
			int numerador = sc.nextInt();

			System.out.print("Informe o denominador: ");
			int denominador = sc.nextInt();

			if (denominador == 0) {
				System.out.printf("DIVISÃO IMPOSSÍVEL!%n%n");
			} else {
				System.out.printf("DIVISÃO = %.2f%n%n", (double) numerador / denominador);
			}

		}

		sc.close();

	}

}