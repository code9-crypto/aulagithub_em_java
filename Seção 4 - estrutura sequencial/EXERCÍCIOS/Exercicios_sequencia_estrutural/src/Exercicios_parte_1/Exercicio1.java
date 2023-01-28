package Exercicios_parte_1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, total;
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextInt();
		total = num1 + num2;
		System.out.printf("A soma de %d + %d = %d", num1, num2, total);

	}

}
