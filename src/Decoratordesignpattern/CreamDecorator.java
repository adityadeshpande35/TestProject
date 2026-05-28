package Decoratordesignpattern;

public class CreamDecorator  extends CoffeeDecorator{

	public CreamDecorator(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription()+",Cream";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return coffee.getCost()+3.5;
	}
}
