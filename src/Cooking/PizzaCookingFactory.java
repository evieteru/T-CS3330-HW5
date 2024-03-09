package Cooking;


import hw5.PizzaType;

import pizzas.*;

public class PizzaCookingFactory {
	
	//Default constructor
	public PizzaCookingFactory () {
		
	}

	public AbstractPizza createPizza(PizzaType pizzaType) {

		
		
		switch (pizzaType) {
		case PizzaType.HAWAIIAN:
			HawaiianPizza newHawaiian = new HawaiianPizza();
			
			int temp = AbstractPizza.getOrderIDCounter();
			newHawaiian.setPizzaOrderID(temp);
	
			return newHawaiian;
			
			
		case PizzaType.MARGHERITA:
			MargheritaPizza newMargherita = new MargheritaPizza();
			
			int temp2 = AbstractPizza.getOrderIDCounter();
			newMargherita.setPizzaOrderID(temp2);
	
			return newMargherita;
			
			
		case PizzaType.SUPREME:
			SupremePizza newSupreme = new SupremePizza();
			
			int temp3 = AbstractPizza.getOrderIDCounter();
			newSupreme.setPizzaOrderID(temp3);
	
			return newSupreme;
			
			
		case PizzaType.VEGETARIAN:
			MargheritaPizza newVegetarian = new MargheritaPizza();
			
			int temp4 = AbstractPizza.getOrderIDCounter();
			newVegetarian.setPizzaOrderID(temp4);
	
			return newVegetarian;
			
			
		default:
			return null;
		}
		
	}
		
}
