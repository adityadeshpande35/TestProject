package Decoratordesignpattern;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee mycoffee=new SimpleCoffee();
		System.out.println(mycoffee.getDescription()+" $"+mycoffee.getCost());
		
		
		mycoffee=new MilkDecorator(mycoffee);
		System.out.println(mycoffee.getDescription()+" $"+mycoffee.getCost());
		
		mycoffee=new SugarDecorator(mycoffee);
		System.out.println(mycoffee.getDescription()+" $"+mycoffee.getCost());

		
		mycoffee=new CreamDecorator(mycoffee);
		System.out.println(mycoffee.getDescription()+" $"+mycoffee.getCost());
		
		
		System.out.println("final cost: $"+mycoffee.getCost());

	}

}
