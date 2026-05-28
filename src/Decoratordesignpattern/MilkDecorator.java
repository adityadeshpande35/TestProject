package Decoratordesignpattern;

public class MilkDecorator extends CoffeeDecorator {

	public MilkDecorator(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription()+",Milk";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return coffee.getCost()+1.5;
	}
}
