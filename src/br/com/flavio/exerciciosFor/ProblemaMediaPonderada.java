package br.com.flavio.exerciciosFor;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMediaPonderada {

	/*
	 * Leia um valor inteiro N, que representa o número de casos de teste que vem a
	 * seguir. Cada caso de teste consiste de 3 valores reais, para os quais você
	 * deverá calcular e mostrar a média ponderada, sendo que o primeiro valor tem
	 * peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale
	 * lembrar que a média ponderada é a soma de todos os valores multiplicados pelo
	 * seu respectivo peso, dividida pela soma dos pesos.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos casos você vai digitar? ");
		int numeroDeCasos = sc.nextInt();

		for (int i = 0; i < numeroDeCasos; i++) {
			System.out.println("Digite três números:");
			double numero1 = sc.nextDouble();
			double numero2 = sc.nextDouble();
			double numero3 = sc.nextDouble();

			double mediaPonderada = (numero1 * 2 + numero2 * 3 + numero3 * 5) / (2 + 3 + 5);

			System.out.printf("%nMÉDIA = %.1f%n%n", mediaPonderada);

		}

		sc.close();

	}

}