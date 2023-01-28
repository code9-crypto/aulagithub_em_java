package Exercicios_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int c1, q1, c2, q2;
		double total, v1, v2;
		c1 = sc.nextInt();
		q1 = sc.nextInt();
		v1 = sc.nextDouble();
		
		c2 = sc.nextInt();
		q2 = sc.nextInt();
		v2 = sc.nextDouble();
		
		total = (v1 * q1) + (v2 * q2);
		
		System.out.printf("VALOR A PAGAR: %.2f", total);
		sc.close();

	}

}
