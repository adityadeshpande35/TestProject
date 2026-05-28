package Decoratordesignpattern;

public class SugarDecorator extends CoffeeDecorator {

	public SugarDecorator(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription()+",Sugar";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return coffee.getCost()+0.5;
	}

}
