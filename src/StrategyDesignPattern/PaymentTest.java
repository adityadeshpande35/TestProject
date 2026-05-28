package StrategyDesignPattern;

public class PaymentTest {
	public static void main(String[] args) {
		
		PaymentContext paymentcontext=new PaymentContext(new CreditCardPayment());
		paymentcontext.pay(120.80);
		paymentcontext.setPaymentStratgy(new PayPalPayment());
		paymentcontext.pay(500.11);
		paymentcontext.setPaymentStratgy(new BankTransferPayment());
		paymentcontext.pay(2500.23);
	}
}
