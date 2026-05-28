package StrategyDesignPattern;

public class CreditCardPayment implements PaymentStragey {

	@Override
	public void pay(double amount) {
		System.out.println("making the payment of amount:"+amount+"using credit card");
		
	}
	
	

}
