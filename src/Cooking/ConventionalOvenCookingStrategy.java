package Cooking;

import pizzas.AbstractPizza;

public class ConventionalOvenCookingStrategy {
	// Override interface cook method
		public boolean cook(AbstractPizza pizza) {
			
			// Set cooking price
			pizza.setCookingPrice(10);
			// Add cooking price to total price
			pizza.updatePizzaPrice();
			// Set cooking strategy according to correct enum value
			pizza.setCookingStrategy(CookingStyleType.CONVENTIONAL_OVEN);
			
			return true;
			}
}
