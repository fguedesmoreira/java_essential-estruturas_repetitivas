package br.com.flavio.exerciciosFor;

import java.util.Scanner;

public class ProblemaDentroFora {

	public static void main(String[] args) {

		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, conforme exemplo
		 */

		Scanner sc = new Scanner(System.in);

		int dentro = 0;
		int fora = 0;

		System.out.print("Quantos números inteiros você vai digitar? ");
		int quantidade = sc.nextInt();

		for (int i = 0; i < quantidade; i++) {
			System.out.print("Digite um número: ");
			int numero = sc.nextInt();

			if (numero >= 10 && numero <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}

		sc.close();

		System.out.printf("%d DENTRO%n%d FORA", dentro, fora);

	}

}