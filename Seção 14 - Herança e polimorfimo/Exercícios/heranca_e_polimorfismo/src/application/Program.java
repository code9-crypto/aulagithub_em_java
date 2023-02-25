package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número da conta: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o titúlar da conta: ");
		String holder = sc.nextLine();
		System.out.print("Digite o saldo inicial da conta: ");
		Double balance = sc.nextDouble();
		System.out.print("Digite o limite de empréstimo que terá: ");
		Double loanLimit = sc.nextDouble();
		
		BusinessAccount business = new BusinessAccount(number, holder, balance, loanLimit);
		
		System.out.println("Esta é a sua nova conta empresarial:");
		System.out.println(business.toString());
		
		sc.close();
	}

}
