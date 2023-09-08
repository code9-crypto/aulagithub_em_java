package services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import entities.Contract;
import entities.Installment;
import services.interfaces.OnlinePaymentService;

public class ContractService{
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public final void processContract(Contract contract, Integer months) {		
		double parcela = contract.getTotalValue() / months;
		double resInter = 0.0;
		double resTaxa = 0.0;
		for( int i = 1; i <= months; i++ ) {			
			resInter = onlinePaymentService.interest(parcela, i);
			double valorInter = parcela + resInter;
			resTaxa = onlinePaymentService.paymentFee(valorInter);
			double total = valorInter + resTaxa;
			LocalDate data = contract.getDate().plusMonths(i);
			
			contract.getInstallments().add(new Installment(data, total));
		}	
		
	}
	
}
