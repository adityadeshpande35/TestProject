package Decoratordesignpattern;

public class SimpleCoffee implements Coffee {

	public String getDescription() {
		// TODO Auto-generated method stub
		return "Simple Coffee";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 5.0;
	}
	
	

}
