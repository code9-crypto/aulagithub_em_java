package Exercicios_parte_1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3,n4,diferenca;
		System.out.print("Primeiro número: ");
		n1 = sc.nextInt();
		System.out.print("Segundo número: ");
		n2 = sc.nextInt();
		System.out.print("Terceiro número: ");
		n3 = sc.nextInt();
		System.out.print("Quarto número: ");
		n4 = sc.nextInt();
		diferenca = (n1 * n2 - n3 * n4);
		System.out.printf("A diferença é: %d",diferenca);
	}

}
