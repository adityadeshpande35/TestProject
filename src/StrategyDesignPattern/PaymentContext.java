package StrategyDesignPattern;

public class PaymentContext {
	
	private PaymentStragey paymentStrategy;
	
	public PaymentContext(PaymentStragey paymentStrategy)
	{
		this.paymentStrategy=paymentStrategy;
	}
	
	public void setPaymentStratgy(PaymentStragey paymentStrategy)
	{
		this.paymentStrategy=paymentStrategy;
	}
	
	public void pay(double amount)
	
	{
		paymentStrategy.pay(amount);
	}

}
