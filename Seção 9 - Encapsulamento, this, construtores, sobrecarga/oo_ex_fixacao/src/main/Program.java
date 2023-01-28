package main;

import java.util.Locale;
import java.util.Scanner;

import banco.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta("Sem cliente", "0", 0.00);
		double valor;
		
		System.out.print("Entre com o número da conta: ");
		String nconta = sc.nextLine();
		conta.setNumConta(nconta);		
		
		System.out.print("Digite o nome do titular: ");
		String tconta = sc.nextLine();
		conta.setTitular(tconta);
		
		System.out.print("Deseja fazer alguma depósito inicial (s/n)? ");
		char resp = sc.next().charAt(0);
		
		if (resp == 's') {
			System.out.print("Por favor, entre com o valor: ");
			valor = sc.nextDouble();
			conta.deposito(valor);
		}
		System.out.println();
		
		System.out.println("DADOS DA CONTA:");
		System.out.print("CONTA: "+conta.getNumConta()+", TITULAR: "+conta.getTitular()+", "
				+ "SALDO: "+ String.format("%.2f", conta.getSaldo()));
		System.out.println();
		System.out.println();
		
		System.out.print("Entre com o valor para depósito: ");
		valor = sc.nextDouble();
		conta.deposito(valor);
		
		System.out.println("DADOS DA CONTA ATUALIZADO:");
		System.out.print("CONTA: "+conta.getNumConta()+", TITULAR: "+conta.getTitular()+", "
				+ "SALDO: "+ String.format("%.2f", conta.getSaldo()));
		System.out.println();
		System.out.println();
		
		System.out.print("Entre com o valor para saque: ");
		valor = sc.nextDouble();
		conta.saque(valor);
		
		System.out.println("DADOS DA CONTA ATUALIZADO:");
		System.out.print("CONTA: "+conta.getNumConta()+", TITULAR: "+conta.getTitular()+", "
				+ "SALDO: "+ String.format("%.2f", conta.getSaldo()));
		
		
		sc.close();
	}
}
