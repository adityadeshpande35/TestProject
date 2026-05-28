package StrategyDesignPattern;

public class BankTransferPayment implements PaymentStragey {
	
	@Override
	public void pay(double amount) {
		System.out.println("making the payment of amount:"+amount+"using BankTransferPayment");
		
	}

}
