package Cooking;

import hw5.PizzaType;
import pizzas.AbstractPizza;

public class PizzaCookingFactory {
	public AbstractPizza createPizza(PizzaType pizzaType) {
		
		switch(pizzaType) {
		case MARGHERITA:
			AbstractPizza new_margherita = new MargheritaPizza();
			new_margherita.setPizzaOrderID(AbstractPizza.getOrderIDCounter());
			return new_margherita;
		case VEGETARIAN:
			AbstractPizza new_vegetarian = new VegetarianPizza();
			new_vegetarian.setPizzaOrderID(AbstractPizza.getOrderIDCounter());
			return new_vegetarian;
		case HAWAIIAN:
			AbstractPizza new_hawaiian = new HawaiianPizza();
			new_hawaiian.setPizzaOrderID(AbstractPizza.getOrderIDCounter());
			return new_hawaiian;
		case SUPREME:
			AbstractPizza new_supreme = new SupremePizza();
			new_supreme.setPizzaOrderID(AbstractPizza.getOrderIDCounter());
			return new_supreme;
		default:
			System.out.println("Invalid pizzaType passed in");
			return null;
		}
		
	}

}
