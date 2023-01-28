package main;

import java.util.Locale;
import java.util.Scanner;

import util.currencyConverter;

public class program {

	public static void main(String[] args) {
		//Formatando para padrão US
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		do {
			//Lendo valores
			System.out.print("What is the dollar price? ");
			double priceDollar = sc.nextDouble();
			System.out.print("How many dollars will be bought: ");
			double amountDollar = sc.nextDouble();
			
			//Pegando e mostrando valores através da classe currencyConverter
			double amountPaid = currencyConverter.converter(priceDollar, amountDollar);
			
			System.out.printf("Amount to be paid in reais: %.2f%n", amountPaid);
			System.out.print("Wish continue(s/n): ");
			resp = sc.next().charAt(0);
		}while(resp == 's');
		sc.close();

	}

}
