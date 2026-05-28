package StrategyDesignPattern;

public class PayPalPayment implements PaymentStragey{

	
	@Override
	public void pay(double amount) {
		System.out.println("making the payment of amount:"+amount+"using Paypal");
		
	}
}
