package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod, qtd;
		double total;
		cod = sc.nextInt();
		qtd = sc.nextInt();
		if( cod == 1 ) {
			total = qtd * 4.50;
			System.out.printf("Total: R$ %.2f", total);
		} else if( cod == 2 ) {
			total = qtd * 4.50;
			System.out.printf("Total: R$ %.2f", total);
		} else if( cod == 3 ) {
			total = qtd * 5.00;
			System.out.printf("Total: R$ %.2f", total);
		} else if( cod == 4 ) {
			total = qtd * 2.00;
			System.out.printf("Total: R$ %.2f", total);
		} else if( cod == 5 ){
			total = qtd * 1.50;
			System.out.printf("Total: R$ %.2f", total);
		}
		
		sc.close();

	}

}
