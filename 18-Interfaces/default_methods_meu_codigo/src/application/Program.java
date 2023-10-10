package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.USAInterestService;
import services.Interfaces.InterestService;

public class Program {
	
	public static void main(String[] args) {
		
		//Iniciando a conf padrão
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Coletando os dados do usuário
		System.out.print("Quantia: ");
		double amount = sc.nextDouble();
		System.out.print("Meses: ");
		int months = sc.nextInt();
		System.out.println("Serviços de taxa disponíveis");
		System.out.println("1 - Brasil, 2 - USA");
		System.out.print("Qual país será este serviço: ");
		int esc = sc.nextInt();
		
		//Separando as escolhas dos serviços
		switch(esc) {
			case 1:
				//Serviço Brasil
				InterestService isBra = new BrazilInterestService(2.0);
				double intBrazil = isBra.payment(amount, months);
				//Exibindo informações
				System.out.println("Pagamento após " + months + " meses:");
				System.out.println(String.format("%.2f", intBrazil));
				break;
			case 2:
				//Serviço USA
				InterestService isUsa = new USAInterestService(1.0);
				double intUSA = isUsa.payment(amount, months);
				//Exibindo informações
				System.out.println("Pagamento após " + months + " meses:");
				System.out.println(String.format("%.2f", intUSA));
				break;
			default:
				System.out.println("Não há serviço para este código");
		}
		
		
		
	}
	
}
