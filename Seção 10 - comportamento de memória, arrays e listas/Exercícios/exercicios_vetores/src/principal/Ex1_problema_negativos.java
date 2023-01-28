package principal;

import java.util.Scanner;

public class Ex1_problema_negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		do {
			if (n > 10) {
				System.out.println("O valor é maior do que 10, "
						+ "favor digitar um valor menor ou igual a 10");
				System.out.println();
				System.out.print("Quantos números você vai digitar: ");
				n = sc.nextInt();
			}			
		}while(n > 10);
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.println("NÚMEROS NEGATIVOS:");
		for (int i = 0; i < n; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}

}
