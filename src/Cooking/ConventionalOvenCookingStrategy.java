package Cooking;

import pizzas.AbstractPizza;

public class ConventionalOvenCookingStrategy {
	
	public boolean cook(AbstractPizza pizza) {
		
		pizza.setCookingPrice(8.0);
		pizza.updatePizzaPrice();
		
		return true;
	}

}
