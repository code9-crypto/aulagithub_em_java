package applicationTaxes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Criando lista das pessoas
		List<Pessoa> list = new ArrayList<>();
		
		//Recebendo quantidade de "pagadores"
		System.out.print("Enter the number of tax payers: ");
		Integer n = sc.nextInt();
		
		//Recebendo a lista de pagadores de acordo com a quantidade recebida acima
		for( int i = 1; i <= n; i++ ) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			switch(ch) {
				case 'i':
					System.out.print("Name: ");
					String nameFisica = sc.next();
					System.out.print("Anual income: ");
					Double incomeFisica = sc.nextDouble();
					System.out.print("Health expenditures: ");
					Double health = sc.nextDouble();
					list.add(new PessoaFisica(nameFisica, incomeFisica, health));
					break;
				case 'c':
					System.out.print("Name: ");
					String name = sc.next();
					System.out.print("Anual income: ");
					Double income = sc.nextDouble();
					System.out.print("Number of employess: ");
					Integer numberEmployees = sc.nextInt();
					list.add(new PessoaJuridica(name, income, numberEmployees));
					break;
			}
		}
		
		System.out.println();
		
		//Exibindo informações
		System.out.println("TAXES PAID:");
		
		//totalizando impostos numa variável para exibe-la depois
		double totalImpostos = 0.0;
		
		for (Pessoa pessoa : list) {
			System.out.println(pessoa.toString());
			totalImpostos += pessoa.imposto();
		}
		System.out.println();
		
		System.out.printf("TOTAL TAXES: %.2f", totalImpostos);
		
		sc.close();
	}

}
