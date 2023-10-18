package br.com.flavio.exerciciosFor;

import java.util.Scanner;

public class ProblemaFatorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de N: ");
		int valor = sc.nextInt();
		int fatorial = 1;

		for (int i = valor; i > 0; i--) {
			fatorial *= i;
		}

		sc.close();

		System.out.println(fatorial);

	}

}