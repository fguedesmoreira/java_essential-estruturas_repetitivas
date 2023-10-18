package br.com.flavio.exerciciosWhile;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaValidacaoDeNota {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia as notas referentes às duas avaliações de um aluno.
		 * Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas
		 * válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve
		 * ser validada separadamente.
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double primeiraNota = sc.nextDouble();

		while (!(primeiraNota >= 0.0 && primeiraNota <= 10.0)) {
			System.out.print("Valor inválido! Tente novamente: ");
			primeiraNota = sc.nextDouble();
		}

		System.out.print("Digite a segunda nota: ");
		double segundaNota = sc.nextDouble();

		while (!(segundaNota >= 0.0 && segundaNota <= 10.0)) {
			System.out.print("Valor inválido! Tente novamente: ");
			segundaNota = sc.nextDouble();
		}

		System.out.printf("MÉDIA = %.2f", (primeiraNota + segundaNota) / 2.0);

		sc.close();

	}

}