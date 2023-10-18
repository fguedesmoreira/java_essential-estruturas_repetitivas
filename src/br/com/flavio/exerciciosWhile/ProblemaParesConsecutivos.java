package br.com.flavio.exerciciosWhile;

import java.util.Scanner;

public class ProblemaParesConsecutivos {

	public static void main(String[] args) {

		/*
		 * O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá
		 * parar quando o valor de X for igual a 0). Para cada X lido, imprima a soma
		 * dos 5 pares consecutivos a partir de X, inclusive o X, se for par. Se o valor
		 * de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da
		 * operação: 4+6+8+10+12, enquanto que se o valor de entrada for 11, por
		 * exemplo, a saída deve ser 80, que é a soma de 12+14+16+18+20.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = sc.nextInt();

		while (numero != 0) {

			int controleSoma = 0;
			int somatorioPares = 0;

			while (controleSoma < 5) {

				if (numero%2 == 0) {
					somatorioPares += numero;
					controleSoma++;
				}

				numero++;

			}

			System.out.printf("SOMA = %d%n%n", somatorioPares);

			System.out.print("Digite um número inteiro: ");
			numero = sc.nextInt();

		}

		sc.close();

	}

}