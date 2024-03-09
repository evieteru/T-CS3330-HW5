package Cooking;

import pizzas.AbstractPizza;

public class MicrowaveOvenCookingStrategy {
	
	public boolean cook(AbstractPizza pizza) {
		
		pizza.setCookingPrice(1.0);
		pizza.updatePizzaPrice();
		
		return true;
	}

}
