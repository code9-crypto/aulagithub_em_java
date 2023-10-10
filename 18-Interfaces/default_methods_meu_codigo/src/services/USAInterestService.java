package services;

import services.Interfaces.InterestService;

public class USAInterestService implements InterestService {
	
	private double interestRate;
	
	public USAInterestService() {
		
	}
	
	public USAInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {		
		return interestRate;
	}

}
