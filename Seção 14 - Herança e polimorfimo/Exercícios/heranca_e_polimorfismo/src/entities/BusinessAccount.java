package entities;

public class BusinessAccount extends Account{
	private Double loanLimit;
	
	public BusinessAccount() {
		
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		/* 
		 o super abaixo está fazendo isso aqui:
		 this.number = number;
		 this.holder = holder;
		 this.balance = balance;
		 */
		super(number, holder, balance); // só com esta linha está fazendo tudo acima citado
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		
	}
	
	public String toString() {
		return "Número da conta: "+	super.getNumber() + 
				"\n Titúlar: " + super.getHolder() +  
				"\n Saldo: " + super.getBalance() + 
				"\n Limite de Empréstimo: " + loanLimit;
	}
}
