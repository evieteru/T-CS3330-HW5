package Cooking;

import pizzas.AbstractPizza;

public class MicrowaveOvenCookingStrategy {
	
		// Override interface cook method
		public boolean cook(AbstractPizza pizza) {
			
			// Set cooking price
			pizza.setCookingPrice(1);
			// Add cooking price to total price
			pizza.updatePizzaPrice();
			// Set cooking strategy according to correct enum value
			pizza.setCookingStrategy(CookingStyleType.BRICK_OVEN);
			
			return true;
		}
}
