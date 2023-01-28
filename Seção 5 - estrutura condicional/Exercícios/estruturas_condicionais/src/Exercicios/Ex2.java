package Exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numdig, total;
		System.out.print("Digite um número: ");
		numdig = sc.nextInt();
		total = numdig % 2;
		if( total == 0 ) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
