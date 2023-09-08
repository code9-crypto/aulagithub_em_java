package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PayPalService;

public class Application {

	public static void main(String[] args) throws ParseException {
		//Configurações padrões
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//Recebendo valores do usuário
		System.out.println("Entre os dados do contrato:");
		System.out.print("Número: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double value = sc.nextDouble();
		System.out.print("Entre com o número de parcelas: ");
		int parcelas = sc.nextInt();
		
		//Instanciando contrato e serviços de pagamento online
		Contract obj = new Contract(number, date, value);
		
		ContractService service = new ContractService(new PayPalService());
		
		service.processContract(obj, parcelas);
		
		System.out.println();
		System.out.println("PARCELAS:");
		for( Installment installment : obj.getInstallments() ) {
			System.out.println(installment);
		}
		
		
		sc.close();
	}

}
