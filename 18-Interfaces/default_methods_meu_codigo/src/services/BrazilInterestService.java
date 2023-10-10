package services;

import services.Interfaces.InterestService;

public class BrazilInterestService implements InterestService {
	
	private double interestRate;
	
	public BrazilInterestService() {
		
	}
	
	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
