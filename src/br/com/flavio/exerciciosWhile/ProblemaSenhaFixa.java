package br.com.flavio.exerciciosWhile;

import java.util.Scanner;

public class ProblemaSenhaFixa {

	public static void main(String[] args) {

		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida! Tente novamente:". Quando a senha for informada corretamente
		 * deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
		 * Considere que a senha correta é o valor 2002.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma senha: ");
		int senha = sc.nextInt();

		while (senha != 2002) {

			System.out.print("Senha Inválida! Tente novamente: ");
			senha = sc.nextInt();

		}

		sc.close();
		System.out.print("Acesso permitido!");

	}

}