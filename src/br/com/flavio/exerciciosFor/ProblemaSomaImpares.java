package br.com.flavio.exerciciosFor;

import java.util.Scanner;

public class ProblemaSomaImpares {

	/*
	 * Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre
	 * a soma dos números impares entre eles.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois números: ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		int soma = 0;

		if (x > y) {
			int a = x;
			x = y;
			y = a;
		}
		
		// Observação: os números informados não entram no somatório, apenas os números 
		// ímpares entre eles (não falou INCLUSIVE)
		for (int i = x + 1; i < y; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}

		System.out.printf("Soma dos ímpares = %d", soma);

		sc.close();

	}

}