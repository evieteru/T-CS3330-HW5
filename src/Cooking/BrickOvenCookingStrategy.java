package Cooking;

import pizzas.AbstractPizza;

public class BrickOvenCookingStrategy implements ICookingStrategy{

	// Override interface cook method
	public boolean cook(AbstractPizza pizza) {
		
		// Set cooking price
		pizza.setCookingPrice(10);
		// Add cooking price to total price
		pizza.updatePizzaPrice();
		// Set cooking strategy according to correct enum value
		pizza.setCookingStrategy(CookingStyleType.BRICK_OVEN);
		
		return true;
		}
		
	}
}
